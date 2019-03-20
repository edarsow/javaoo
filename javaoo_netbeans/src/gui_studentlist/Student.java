/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author edarsow
 */
public class Student {
    int id;
    String name;
    String course;
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(id);
        sb.append("; Name: ");
        sb.append(name);
        sb.append("; Course: ");
        sb.append(course);
        return sb.toString();
    }
    
}
