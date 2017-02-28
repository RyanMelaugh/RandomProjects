const int sensorPin = A0;
double base = 20.0;
int baseBtn = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);

  for(int pinNumber = 2; pinNumber<5; pinNumber++){
    pinMode(pinNumber, OUTPUT);
    digitalWrite(pinNumber, LOW);
  }
  
  pinMode(5, INPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  int sensorVal = analogRead(sensorPin);
  Serial.print("Sensor Value: ");
  Serial.print(sensorVal);

  float voltage = (sensorVal/1024.0) * 5.0;
  Serial.print(", Volts: ");
  Serial.print(voltage);

  Serial.print(", degress C: ");
  float temp = (voltage - .5) * 100;
  Serial.println(temp);

  Serial.print(", base Degrees C: ");
  Serial.print(base);
  Serial.print(", ");
  
  baseBtn = digitalRead(5);
  if(baseBtn == HIGH){
    Serial.println("Pressed");
    base = temp;
  }

  if(temp < base){
    digitalWrite(2, LOW);
    digitalWrite(3, LOW);
    digitalWrite(4, LOW);
  }else if(temp >= base+2 && temp < base+4){
    digitalWrite(2, HIGH);
    digitalWrite(3, LOW);
    digitalWrite(4, LOW);
  }else if(temp >= base+4 && temp < base+6){
    digitalWrite(2, HIGH);
    digitalWrite(3, HIGH);
    digitalWrite(4, LOW);
  }else if(temp >= base+6){
    digitalWrite(2, HIGH);
    digitalWrite(3, HIGH);
    digitalWrite(4, HIGH);
    }
    delay(1);
}
