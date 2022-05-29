package ObserverPattern.Simple;

public class WeatherData {

    // 온도 값을 리턴한다.
    public float getTemperature(){ return 0;}
    // 습도 값을 리턴한다.
    public float getHumidity(){ return 0;}
    // 기압 값을 리턴한다.
    public float getPressure(){ return 0;}

    // 각 Display 인스턴스를 새 값으로 동기화 한다.
    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

//        currentConditionsDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp, humidity, pressure);
//        forecastDisplay.update(temp, humidity, pressure);
    }
}
