package composition;


class Tas{
    Uang money;
    Laptop merk;
    
    Tas(Uang money, Laptop merk){
        this.money = money;
        this.merk = merk;
    }

    public Uang getMoney() {
        return money;
    }

    public void setMoney(Uang money) {
        this.money = money;
    }

    public Laptop getmerk() {
        return merk;
    }

    public void setmerk(Laptop merk) {
        this.merk = merk;
    }
    
    
}