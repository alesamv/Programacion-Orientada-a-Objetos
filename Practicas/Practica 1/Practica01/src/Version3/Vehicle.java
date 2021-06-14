/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version3;

/**
 *
 * @author AlexaMV
 */
public class Vehicle 
{
    private double load;
    private double maxLoad;
    
    public Vehicle(double maxLoad)
    {
        maxLoad = kiloToNewtons(maxLoad);
        this.maxLoad = maxLoad;
    }
    public double getLoad()
    {
        return newtonsToKilo(load);
    }
    public double getMaxLoad()
    {
        return kiloToNewtons(maxLoad);
    }
    public boolean addBox(double load)
    {
        this.load = this.load + load;
        if (this.load > maxLoad)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    private double kiloToNewtons(double maxLoad)
    {
        return maxLoad * 9.8;
    }
    private double newtonsToKilo(double load)
    {
        return load/9.8;
    }
}
