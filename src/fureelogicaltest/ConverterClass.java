/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fureelogicaltest;

/**
 *
 * @author Lenovo
 */
public class ConverterClass {
    String units (int a) {
        StringBuilder units = new StringBuilder();
        
        if (a == 1) {
            units.append("satu ");
        } else {
            units.append(numberToNumberName(a));
        }
        
        return units.toString();
    }
    
    String dozens (int a) {
        StringBuilder dozens = new StringBuilder();
        
        if (a >= 10000) {
            if ((a/1000) > 10 && (a/1000) < 20) {
                dozens
                        .append(numberToNumberName((a%10000)/1000))
                        .append("belas ")
                        .append("ribu ")
                        .append(hundreds(a%1000));
            }
            else {
                dozens
                        .append(numberToNumberName(a/10000))
                        .append("puluh ");
                if (((a%10000)/1000) == 1){
                    dozens
                            .append("satu ")
                            .append("ribu ")
                            .append(hundreds(a%1000));
                }
                else if ((a%10000) <= 1000) {
                    dozens
                            .append(numberToNumberName(a%10000))
                            .append("ribu ")
                            .append(hundreds(a%10000));
                }
                else {
                    dozens
                            .append(thousand(a%10000));
                }
            }
        } else if (a >= 10) {
            if (a > 10 && a < 20) {
                dozens
                        .append(numberToNumberName(a%10))
                        .append("belas ");
            }
            else {
                dozens
                        .append(numberToNumberName(a/10))
                        .append("puluh ")
                        .append(units(a%10));
            }
        }
        else {
            dozens.append(units(a));
        }
        
        return dozens.toString();
    }
    
    String hundreds (int a) {
        StringBuilder hundreds = new StringBuilder();
        
        if (a >= 100000){
            if (a % 100000 < 1000) hundreds
                    .append(numberToNumberName(a/100000))
                    .append("ratus ribu ")
                    .append(thousand(a%100000));
            
            else if ((a%100000) >= 10000) {
                hundreds
                    .append(numberToNumberName(a/100000))
                    .append("ratus ")
                    .append(dozens(a%100000));
            } else if ((a%100000) >= 1000) {
                hundreds
                    .append(numberToNumberName(a/100000))
                    .append("ratus ")
                    .append(thousand(a%100000));
            } 
            else hundreds
                    .append(numberToNumberName(a/100000))
                    .append("ratus ")
                    .append(thousand(a%100000));
        } 
        else if (a >= 100) {
            hundreds
                    .append(numberToNumberName(a/100))
                    .append("ratus ")
                    .append(dozens(a%100));
        } 
        else {
            hundreds.append(dozens(a));
        }
        
        return hundreds.toString();
    }
    
    String thousand (int a) {
        StringBuilder thousand = new StringBuilder();
        
        if (a >100000) {
            thousand.append(hundreds(a));
            
        }
        else if (a > 10000) {
            thousand.append(dozens(a));
        }
        else if (a >= 1000) {
            thousand.append(numberToNumberName(a/1000))
                    .append("ribu ")
                    .append(hundreds(a%1000));
        }
        else {
            thousand.append(hundreds(a));
        }
        
        return thousand.toString();
    }
    
    String numberToNumberName (int a) {
        StringBuilder number = new StringBuilder();
        
        switch (a) {
            case 1:
                number.append("se");
                break;
            case 2:
                number.append("dua ");
                break;
            case 3:
                number.append("tiga ");
                break;
            case 4:
                number.append("empat ");
                break;
            case 5:
                number.append("lima ");
                break;
            case 6:
                number.append("enam ");
                break;
            case 7:
                number.append("tujuh ");
                break;
            case 8:
                number.append("delapan ");
                break;
            case 9:
                number.append("sembilan ");
                break;
            default:
                number.append("");
                break;
        }
        
        return number.toString();
    }
}
