/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version2;

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
        this.maxLoad = maxLoad;
    }
    public double getLoad()
    {
        return load;
    }
    public double getMaxLoad()
    {
        return maxLoad;
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
}
