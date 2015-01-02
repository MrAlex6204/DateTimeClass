package com.mralex6204.datetime;
import java.util.*;
/**
 * 
 * @author MrAlex6204.
 */
class DateTime{
    private final static Calendar _dateNow = Calendar.getInstance();
    
    public static String getMonth(){
        String month ;
        switch(_dateNow.get(Calendar.MONTH)){
            case 0:
                month = "Enero";
                break;
            case 1:
                month = "Febrero";
                break;
            case 2:
                month = "Marzo";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Mayo";
                break;
            case 6:
                month = "Junio";
                break;
            case 7: 
                month = "Julio";
                break;                
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Septiembre";
                break;
            case 10:
                month = "Noviembre";
                break;
            case 11:
                month = "Diciembre";
                break;
            default:
                month = "None";
            
        }
       return month;
    }
    public static String getDay(){
        return Integer.toString( _dateNow.get(Calendar.DAY_OF_MONTH));
    }   
    public static String getDayOfWeek(){
        String dayName;   
        switch(_dateNow.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY:
                dayName = "Domingo";
                break;
            case Calendar.MONDAY:
                dayName = "Lunes";
                break;
            case Calendar.TUESDAY:
                dayName = "Martes";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Miercoles";
                break;
            case Calendar.THURSDAY:
                dayName = "Jueves";
                break;
            case Calendar.FRIDAY:
                dayName = "Viernes";
                break;
            case Calendar.SATURDAY:
                dayName = "Sabado";
                break;
            default:
                dayName = "None";
        }
        return dayName;
    }
    public static String getYear(){
       return Integer.toString(_dateNow.get(Calendar.YEAR));
    }
    public static String getTime(){
        String time = "" ;
        time += Integer.toString(_dateNow.get(Calendar.HOUR))+":";
        time += Integer.toString(_dateNow.get(Calendar.MINUTE))+":";
        time += Integer.toString(_dateNow.get(Calendar.SECOND));
        if(_dateNow.get(Calendar.AM_PM) == Calendar.AM) {
            time+= " AM";
        }else{
            time+=" PM";
        }
         
        return time;
    }
        
    public static String Now(){
       return (getDayOfWeek()+", "+getDay()+" de "+getMonth()+" del "+getYear()+ " "+getTime());
    }
    
    }
    
