class a4
{
  h a = null;
  g jdField_if = null;
  
  public a4(h paramh)
  {
    this.a = paramh;
    this.jdField_if = paramh.cJ;
  }
  
  public void a(byte paramByte)
  {
    if (this.jdField_if.gL) {
      switch (paramByte)
      {
      case 0: 
        if (this.jdField_if.ea.h == 21)
        {
          this.jdField_if.ea.jdField_try = this.jdField_if.b5;
          this.jdField_if.ea.a(50);
        }
        else
        {
          this.jdField_if.ea.o = this.jdField_if.b5;
          this.jdField_if.ea.a(23);
        }
        break;
      case 1: 
        this.jdField_if.jdField_do = 26;
      }
    } else {
      switch (paramByte)
      {
      case 0: 
        this.a.f(this.jdField_if.b5);
        this.jdField_if.jdField_do = 26;
        break;
      case 1: 
        this.jdField_if.jdField_do = 26;
      }
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\a4.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */