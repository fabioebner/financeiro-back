package br.com.lumera.financeiroback.entity.privado;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CustasAnteriorVO {
    @Id
    private Long id;
    private BigDecimal custas1 = BigDecimal.ZERO;
    private BigDecimal custas2 = BigDecimal.ZERO;
    private BigDecimal custas3 = BigDecimal.ZERO;
    private BigDecimal custas4 = BigDecimal.ZERO;
    private BigDecimal custas5 = BigDecimal.ZERO;
    private BigDecimal custas6 = BigDecimal.ZERO;
    private BigDecimal custas7 = BigDecimal.ZERO;
    private BigDecimal custas8 = BigDecimal.ZERO;
    private BigDecimal custas9 = BigDecimal.ZERO;
    private BigDecimal custas10 = BigDecimal.ZERO;

//    public BigDecimal getCustas1() {
//        if(custas1 == null ){
//            custas1 = BigDecimal.ZERO;
//        }
//        return custas1;
//    }
//
//    public void setCustas1(BigDecimal custas1) {
//        this.custas1 = custas1;
//    }
//
//    public BigDecimal getCustas2() {
//        if(custas2 == null ){
//            custas2 = BigDecimal.ZERO;
//        }
//        return custas2;
//    }
//
//    public void setCustas2(BigDecimal custas2) {
//        this.custas2 = custas2;
//    }
//
//    public BigDecimal getCustas3() {
//        if(custas3 == null ){
//            custas3 = BigDecimal.ZERO;
//        }
//        return custas3;
//    }
//
//    public void setCustas3(BigDecimal custas3) {
//        this.custas3 = custas3;
//    }
//
//    public BigDecimal getCustas4() {
//        if(custas4 == null ){
//            custas4 = BigDecimal.ZERO;
//        }
//        return custas4;
//    }
//
//    public void setCustas4(BigDecimal custas4) {
//        this.custas4 = custas4;
//    }
//
//    public BigDecimal getCustas5() {
//        if(custas5 == null ){
//            custas5 = BigDecimal.ZERO;
//        }
//        return custas5;
//    }
//
//    public void setCustas5(BigDecimal custas5) {
//        this.custas5 = custas5;
//    }
//
//    public BigDecimal getCustas6() {
//        if(custas6 == null ){
//            custas6 = BigDecimal.ZERO;
//        }
//        return custas6;
//    }
//
//    public void setCustas6(BigDecimal custas6) {
//        this.custas6 = custas6;
//    }
//
//    public BigDecimal getCustas7() {
//        if(custas7 == null ){
//            custas7 = BigDecimal.ZERO;
//        }
//        return custas7;
//    }
//
//    public void setCustas7(BigDecimal custas7) {
//        this.custas7 = custas7;
//    }
//
//    public BigDecimal getCustas8() {
//        if(custas8 == null ){
//            custas8 = BigDecimal.ZERO;
//        }
//        return custas8;
//    }
//
//    public void setCustas8(BigDecimal custas8) {
//        this.custas8 = custas8;
//    }
//
//    public BigDecimal getCustas9() {
//        if(custas9 == null ){
//            custas9 = BigDecimal.ZERO;
//        }
//        return custas9;
//    }
//
//    public void setCustas9(BigDecimal custas9) {
//        this.custas9 = custas9;
//    }
//
//    public BigDecimal getCustas10() {
//        if(custas10 == null ){
//            custas10 = BigDecimal.ZERO;
//        }
//        return custas10;
//    }
//
//    public void setCustas10(BigDecimal custas10) {
//        this.custas10 = custas10;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCustas1() {
        return custas1;
    }

    public void setCustas1(BigDecimal custas1) {
        this.custas1 = custas1;
    }

    public BigDecimal getCustas2() {
        return custas2;
    }

    public void setCustas2(BigDecimal custas2) {
        this.custas2 = custas2;
    }

    public BigDecimal getCustas3() {
        return custas3;
    }

    public void setCustas3(BigDecimal custas3) {
        this.custas3 = custas3;
    }

    public BigDecimal getCustas4() {
        return custas4;
    }

    public void setCustas4(BigDecimal custas4) {
        this.custas4 = custas4;
    }

    public BigDecimal getCustas5() {
        return custas5;
    }

    public void setCustas5(BigDecimal custas5) {
        this.custas5 = custas5;
    }

    public BigDecimal getCustas6() {
        return custas6;
    }

    public void setCustas6(BigDecimal custas6) {
        this.custas6 = custas6;
    }

    public BigDecimal getCustas7() {
        return custas7;
    }

    public void setCustas7(BigDecimal custas7) {
        this.custas7 = custas7;
    }

    public BigDecimal getCustas8() {
        return custas8;
    }

    public void setCustas8(BigDecimal custas8) {
        this.custas8 = custas8;
    }

    public BigDecimal getCustas9() {
        return custas9;
    }

    public void setCustas9(BigDecimal custas9) {
        this.custas9 = custas9;
    }

    public BigDecimal getCustas10() {
        return custas10;
    }

    public void setCustas10(BigDecimal custas10) {
        this.custas10 = custas10;
    }
}
