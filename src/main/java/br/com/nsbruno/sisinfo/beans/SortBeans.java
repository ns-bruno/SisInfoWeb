/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nsbruno.sisinfo.beans;

import java.util.Map;
import lombok.Data;

/**
 *
 * @author Nogueira
 */
@Data
public class SortBeans {
    boolean sorted = false, // Marca se foi feito uma ordenacao
            unsorted = true,// Marca se nao existe nenuma ordenacao
            empty = true;   // Caso nao foi passado nenhuma ordenacao
}
