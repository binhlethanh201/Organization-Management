/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DTO;

/**
 *
 * @author thanhbinhle
 */
abstract public class Organization {
    private int size;

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    abstract public void communicateByTool();

    @Override
    public String toString() {
        return "The organization's size is: " +size;
    }
    
}

