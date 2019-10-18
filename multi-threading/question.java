import java.util.Scanner;
import java.util.Random;

class even implements Runnable
{
    Thread t;
    int num;
    even(String name,int n)
    {
        num=n;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {
        System.out.println("SQUARE="+num*num+" exiting even");
    }
}

class odd implements Runnable
{
    Thread t;
    int num;
    odd(String name,int n)
    {
        num=n;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {
        System.out.println("CUBE="+num*num*num+" exiting odd");

    }
}

class random implements Runnable
{
    Thread t;
    boolean res=true;
    Random rand=new Random();
    even e=null;
    odd o=null;
    random(String name)
    {
        t=new Thread(this,name);
        System.out.println("thread created:"+t);
        t.start();
    }
    public void run()
    {
        while(res)
        {
            int n=rand.nextInt(50)+1;
            System.out.println("number="+n);
            if(n%2==0)
            {
                e=new even("EVEN",n);
            }
            else
            {
                o=new odd("ODD",n);
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
                res=false;
            }
            try
            {
                if(e!=null)
                {e.t.join();}
                if(o!=null)
                {o.t.join();}
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            e=null;
            o=null;
        }
        System.out.println("EXITING RANDOM THREAD");
    }
    public void stop()
    {res=false;}
}

class question
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("WILL PRINT RANDOM NUMBERS AND THEIR SQUARE IF EVEN ELSE ITS CUBE EVERY SECOND");
        System.out.println("AT ANY MOMENT PRESS 1 AND ENTER KEY TO STOP");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        random r=new random("random");
        int stop=input.nextInt();
        if(stop==1)
        {
            r.stop();
        }
        try
        {
            r.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("EXITING MAIN THREAD");
        input.close();
    }
}