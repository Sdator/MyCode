import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import kava.lang.Threak;

class h
  extends GameCanvas
  implements Runnable
{
  byte ef = 0;
  boolean bu = false;
  static final int eV = 6;
  static final int eU = 7;
  static final int eP = 5;
  static final int ci = 1;
  static final int em = 2;
  static final int aC = 3;
  static final int fg = 4;
  static boolean aL = false;
  static final boolean g = true;
  static final boolean O = false;
  static final boolean a6 = false;
  static final boolean ev = true;
  static final byte f4 = 1;
  static byte a9 = 2;
  static final int dK = 20;
  static boolean dc = false;
  static final boolean eI = true;
  static final boolean bF = false;
  static final boolean Y = false;
  static boolean ff = true;
  static final boolean P = true;
  static boolean cz = false;
  static boolean ek = false;
  static final boolean bP = false;
  static final boolean eW = true;
  static String fY = "1.0.40";
  static String bL;
  static String gg;
  static final byte e6 = 0;
  static String b9 = "http://gameta.cn/ota/download.jsp";
  static String bB = "http://gameta.cn";
  static String ea = "http://gameta.cn/sot_bill_option.jsp";
  public static String cc = "101.201.239.137:9090";
  static final byte a = 30;
  static final byte cG = 25;
  Threak dM;
  byte[] cH;
  byte[] fe = new byte[8];
  byte[][] ae = new byte[8][];
  byte[] cs = new byte[8];
  byte jdField_null;
  boolean d7 = false;
  static boolean f5 = false;
  static final byte[] fE = { 1, 4, 6, 11, 14, 17, 18, 20 };
  byte fs = 0;
  static byte[] Q = null;
  static byte[] bg = null;
  static byte[] J = null;
  static final byte[] eE = { 1, 0, 0, 0, 3, 7, -45 };
  static int bn = 70;
  static final short aS = 120;
  public static final byte eL = 0;
  public static final byte dH = 2;
  public static final byte fX = 7;
  public static final byte c = 1;
  public static final byte e2 = 4;
  public static final byte x = 5;
  public static final byte ab = 3;
  public static final byte f9 = 6;
  static short dU;
  static short fp;
  boolean j = false;
  boolean F = false;
  public byte t = 2;
  public byte dT = 0;
  byte cv = 0;
  byte eQ = 0;
  boolean fI = false;
  byte b3 = 0;
  boolean bY;
  boolean cr;
  short v;
  public static byte bm = 100;
  public static final byte aQ = 5;
  short cT;
  short[] aN = null;
  short[] aK = null;
  byte[] c8 = null;
  private static final int[] p = { 4144959, 8355711, 15724527 };
  public static String[] dh = { "个人", "宠物", "交互", "聊天", "商城", "系统", "VIP" };
  public static String[][] cg = { { "道具", "技能", "属性", "摆摊", "任务", "金市" }, { "宠物", "技能", "交易" }, { "附近", "队伍", "公会", "请求", "排行", "关系" }, { "发言", "好友", "屏蔽", "记录" }, { "新品", "常规", "充值" }, { "充值", "设置", "复位", "帮助", "客服", "退出" }, { "申请", "查询", "说明" } };
  static final byte[] gj = { -119, 80, 78, 71, 13, 10, 26, 10 };
  static final byte fb = 20;
  static final int eA = Font.getFont(0, 0, 8).getHeight();
  static final int[][] b2 = { { 16768256, 14535680 }, { 60928, 2254336 }, { 15724527, 3355443 }, { 39423, 1976639 }, { 16711680, 7798784 }, { 16777164, 11184810 }, { 12255453, 5570662 }, { 16750899, 0 }, { 30668, 30668 } };
  static final byte cO = 0;
  static final byte cV = 1;
  static final byte fV = 2;
  static final byte fo = 3;
  static final byte z = 4;
  static final byte eH = 5;
  static final byte H = 6;
  static final byte fC = 7;
  static final byte fL = 8;
  static final int gh = b2[0][1];
  SFMIDlet fG;
  public Graphics fj = null;
  Image[] aH;
  x bV;
  x[] cl;
  public ap bj = null;
  Threak bZ = null;
  public ag cZ = null;
  public static byte f0 = 5;
  public a3[] b7 = new a3[f0];
  public byte jdField_try = 0;
  public int[] ee;
  public boolean[] f3;
  public static byte e1;
  public static byte fh;
  public static byte a1;
  public static byte aw;
  public static byte cu;
  y s = null;
  g cJ = null;
  ah i = null;
  a8 B = null;
  d aj = null;
  an fm = null;
  w d9 = null;
  aj ex = null;
  av e0 = null;
  z jdField_long = null;
  r dy = null;
  al ez = null;
  e bv = null;
  v bf = null;
  a bx = null;
  ai ck = null;
  az bM = null;
  ab ac = null;
  ad c9 = null;
  aq fF = null;
  as S = null;
  i du = null;
  am ct = null;
  au bS = null;
  p a4 = null;
  j di = null;
  o dJ = null;
  b aI = null;
  ac br = null;
  aa as = null;
  boolean fK = false;
  byte dp;
  public int[][] e4 = (int[][])null;
  public byte[] d8 = null;
  private static Random A = new Random();
  public static String[] aD = null;
  public static String[] fN = null;
  public static String[] aJ = null;
  public static boolean[] aO = null;
  public static boolean[] bz = null;
  public static short[] ce = null;
  public static short[] bw = null;
  public static byte[] bX = null;
  public static String[] cD = null;
  public static byte[][] eh = (byte[][])null;
  public q aG;
  public ak bR = null;
  public static String[] eK = null;
  public static short[] aA = null;
  public static short[] es = null;
  public short M = 4;
  public short bH;
  public String aF;
  short eb;
  String[] dk;
  int U;
  private static boolean fv;
  private static Timer ft;
  static final Font dA = Font.getFont(0, 0, 8);
  public static boolean f1;
  public boolean an;
  long bU;
  long bd;
  String K = null;
  static boolean bi = false;
  int cb;
  public static final byte jdField_int = 36;
  String dv = "";
  String dw = "";
  String jdField_do = "";
  String fl = "";
  byte fA = 0;
  String aM = null;
  boolean bq = false;
  boolean dL = false;
  int bD;
  int ey;
  int dl;
  short aW;
  short aV;
  boolean d5 = false;
  short am;
  static final String E = "OPTION";
  static final String c6 = "PLAYER1";
  static final String cC = "PLAYER2";
  static final String da = "RESLIST1";
  static final String e7 = "RES1";
  private static final byte ew = 15;
  private static byte eu = 0;
  private static short[] et = null;
  private static byte[] er = null;
  private static short[] ep = null;
  private static short[] eo = null;
  private static byte[] en = null;
  public Image gb = null;
  public Image af = null;
  public Image fz = null;
  public Image fR = null;
  public Image cq = null;
  public Image cm = null;
  public Image b5 = null;
  public Image gc = null;
  public Image fn = null;
  public Image jdField_goto = null;
  public Image eD = null;
  public x b0 = null;
  public x dF = null;
  public Image[][] o = (Image[][])null;
  public Image bt = null;
  public Image eZ = null;
  short bT;
  short dE = -1;
  public static short eT;
  public static short eS;
  public static byte u = 24;
  public static byte b8 = 24;
  public static final byte cM = 0;
  public static final byte dD = 1;
  public short ad;
  public short dz;
  public short[] fJ;
  public byte w;
  public byte bO;
  public short fU;
  public String cR;
  public short fi;
  public byte cN;
  static short[] jdField_void = new short[4];
  static short[] al = new short[4];
  static String[] ga = new String[4];
  public static short[] h;
  private Graphics ei;
  private Image d4;
  private boolean d1;
  private int d0;
  private int dZ;
  private int dY;
  private int dX;
  public static byte e5 = 0;
  public static long[] d3 = null;
  public static byte[] cx = new byte[e5];
  public static final short bI = 3840;
  public static final short dj = 5000;
  public static final byte eR = 100;
  public static final short bW = 5100;
  public static final short d = 512;
  public static final short T = 10000;
  public static final short cd = 3;
  public static final short ch = 20000;
  public static final short eX = 512;
  public static final short c1 = 21000;
  public static byte c3 = 7;
  public static final short bC = 10100;
  public static final byte f8 = 20;
  public static final short dn = 10200;
  public static final byte dW = 10;
  public static final byte fW = 0;
  public static final byte eN = 1;
  public static final byte gi = 0;
  public static final byte eM = 1;
  public static final byte eq = 2;
  public static final byte l = 3;
  public static final byte b = 4;
  public static final byte fS = 5;
  public static final byte f7 = 6;
  public static final byte dI = 7;
  public static final byte jdField_case = 8;
  public static final byte ah = 9;
  public static final byte fO = 90;
  public static final byte cW = 91;
  public static final byte ba = 100;
  public static final byte fu = 101;
  public static final byte ai = 102;
  public static final byte bQ = 103;
  public static final byte dg = 104;
  public static final byte dr = 105;
  public static final byte aZ = 106;
  public static final byte c4 = 107;
  public static final byte aU = 108;
  public static final byte cU = 109;
  public static final byte b1 = 110;
  public static final byte I = 111;
  public static final byte X = 112;
  public static final byte a3 = 113;
  public static final byte aq = 114;
  public static final byte gf = 115;
  public static final byte bo = 116;
  public static final byte eB = 117;
  public static final byte dx = 118;
  public static final byte cB = 119;
  public static final byte eF = 120;
  public static final byte at = 121;
  public static final byte ge = 122;
  public static final byte bl = 123;
  public static final byte bK = 124;
  public static final byte bp = 125;
  public static final byte f6 = 126;
  public static final byte dR = 127;
  public static byte[] jdField_if = null;
  public static int[] W = null;
  public static String[] R = null;
  public static String[] fq = null;
  public static short[] fT = null;
  public static byte[] d6 = null;
  public static Image fy = null;
  public static String[] by = null;
  public static String[] aY = null;
  public static short[] el = null;
  public static short[] fc = null;
  public static String[] bc = null;
  public static String[] fk = null;
  public static Image dG = null;
  public static String[] a0 = null;
  public static String[] b4 = null;
  public static short[] C = null;
  public static x a5 = null;
  public static int[][] fZ = (int[][])null;
  public static byte[][][] cI = new byte[100][2][2];
  public static String[] dC = null;
  public static int[] dt = null;
  String be = null;
  byte D;
  short eJ = -1;
  int fw;
  int av;
  byte az;
  short ay;
  short f;
  byte[] e3 = null;
  public static int[] V = new int[''];
  static String[] a8 = { "物攻", "物防", "魔攻", "魔防" };
  public boolean q;
  byte fQ = 0;
  public boolean eO = false;
  static boolean[] c7 = new boolean[6];
  public static final byte cS = 0;
  public static final byte cA = 1;
  public static final byte cf = 2;
  public static final byte fa = 3;
  public static final byte e9 = 4;
  public static final byte ax = 5;
  public static final String[] G = { "疾速卡", "强化物攻卡", "强化物防卡", "强化魔攻卡", "强化魔防卡" };
  private static final short[] fd = { 0, 4, 8, 13, 17, 22, 26, 31, 35, 40, 44, 48, 53, 57, 61, 66, 70, 74, 79, 83, 87, 91, 95, 100, 104, 108, 112, 116, 120, 124, 127, 131, 135, 139, 143, 146, 150, 154, 157, 161, 164, 167, 171, 174, 177, 181, 184, 187, 190, 193, 196, 198, 201, 204, 207, 209, 212, 214, 217, 219, 221, 223, 226, 228, 230, 232, 233, 235, 237, 238, 240, 242, 243, 244, 246, 247, 248, 249, 250, 251, 252, 252, 253, 254, 254, 255, 255, 255, 256, 256, 256 };
  public int[] dV = null;
  public int jdField_else = 0;
  public static final byte cw = 18;
  public static byte e8;
  public static short[] gd = new short[18];
  public static short[] m = new short[18];
  public static boolean[] N = new boolean[18];
  public static short[] eY = new short[18];
  public static short[] dm = new short[18];
  public static short[] d2 = new short[18];
  public static short[] dQ = new short[18];
  public static short[] aR = new short[18];
  public static short[] fH = new short[18];
  public static short[] fP = new short[18];
  public static short[] eg = new short[18];
  public static String[] bb = new String[18];
  public static byte[] aP = new byte[18];
  public static byte y = 10;
  public static byte bN = 0;
  public static String[] bG = new String[y];
  public static short[] ds = new short[y];
  public static byte[] ej = new byte[y];
  public static byte[] cy = new byte[y];
  public static short[] ec = new short[y];
  public static byte[] aa = new byte[y];
  public static final byte dd = 25;
  public static byte ca = 0;
  public static short[] aE = new short[25];
  public static String[] co = new String[25];
  public static byte[] f2 = new byte[25];
  public static byte[] c5 = new byte[25];
  public static short[] k = new short[25];
  public static byte[] dN = new byte[25];
  public static byte[] eG = new byte[25];
  public static int[] ed = new int[25];
  public static boolean[] cj = new boolean[25];
  public static byte[] fB = new byte[25];
  public static boolean[] dB = new boolean[25];
  public static short[][] dP = new short[25][8];
  public static short[] jdField_char = new short[25];
  public static short[] jdField_byte = new short[25];
  public static byte[] bk = new byte[25];
  public static byte[] bA = new byte[25];
  public static boolean[] fx = new boolean[25];
  public static boolean[] df = new boolean[25];
  public static byte[] cF = new byte[25];
  public static byte[] cE = new byte[25];
  boolean eC = false;
  String L = null;
  byte bs;
  short cQ;
  byte r;
  byte aX;
  byte c2;
  short b6;
  byte bE;
  boolean ao;
  short jdField_new;
  public short[][] ar = (short[][])null;
  public short[][] ap = (short[][])null;
  public byte[][] Z = (byte[][])null;
  public short[][] aT = (short[][])null;
  public byte[][] au = (byte[][])null;
  String ak = null;
  public static final byte ag = 2;
  public static final byte fM = 10;
  public byte dq = 0;
  public boolean[] cY = new boolean[2];
  public short[][] cp = new short[2][10];
  public short[][] cn = new short[2][10];
  public byte[] cL = new byte[2];
  public byte[][] dO = new byte[2][10];
  public short[][] fD = new short[2][10];
  public byte[] cX = new byte[2];
  short[] bJ = null;
  short[] fr = null;
  public int de = 0;
  public static String[] a7 = { "喂养", "激活", "进化", "舍弃", "返回" };
  Calendar jdField_for = Calendar.getInstance();
  byte db;
  byte[] e = null;
  int[][] dS = (int[][])null;
  x c0 = null;
  Image a2 = null;
  public int[] bh = null;
  public String[] aB = null;
  public byte[] n = null;
  Image cP = null;
  int[] cK = null;
  
  public void pointerPressed(int paramInt1, int paramInt2)
  {
    if ((this.bj == this.cJ) && (this.cJ.jdField_do == 0))
    {
      int i1 = 24;
      int i2 = 18;
      int i3 = 45;
      int i4 = fp - 2 * eA - 10 - i2 - 1;
      int i5 = (dU - 2 * i3 - i1 * 4) / 4;
      i3 += i5 / 2;
      if ((paramInt1 < 40) && (paramInt2 < 80)) {
        this.bj.jdMethod_if(6);
      } else if ((paramInt1 < 40) && (paramInt2 > i4 - 10) && (paramInt2 < i4 + 25)) {
        this.bj.jdMethod_if(35);
      } else if ((paramInt1 > dU - 42) && (paramInt2 > i4 - 10) && (paramInt2 < i4 + 25)) {
        this.bj.jdMethod_if(48);
      } else if ((paramInt1 > dU - 70) && (paramInt2 > this.bO * 2 - 5) && (paramInt2 < this.bO * 2 + 25)) {
        this.bj.jdMethod_if(42);
      } else {
        for (int i6 = 0; i6 < ag.f7; i6 = (byte)(i6 + 1)) {
          if (a(paramInt1, paramInt2, 1, 1, i3 + i6 * (i1 + i5) - i5 / 2, i4 - 8, i1 + i5, i2 + 16))
          {
            int i7 = -1;
            switch (i6)
            {
            case 0: 
              i7 = 49;
              break;
            case 1: 
              i7 = 51;
              break;
            case 2: 
              i7 = 55;
              break;
            case 3: 
              i7 = 57;
            }
            this.cJ.jdMethod_if(i7);
            break;
          }
        }
      }
      return;
    }
    if ((paramInt1 < 30) && (paramInt2 > fp - 30)) {
      this.bj.jdMethod_if(6);
    } else if ((paramInt1 > dU - 30) && (paramInt2 > fp - 30)) {
      this.bj.jdMethod_if(7);
    }
  }
  
  public void pointerReleased(int paramInt1, int paramInt2)
  {
    if ((this.bj == this.cJ) && (this.cJ.jdField_do == 0))
    {
      int i1 = 24;
      int i2 = 18;
      int i3 = 12;
      int i4 = fp - 2 * eA - 10 - i2 - 1;
      int i5 = 15;
      for (int i6 = 0; i6 < ag.f7; i6 = (byte)(i6 + 1)) {
        if (a(paramInt1, paramInt2, 1, 1, i3 + i6 * (i1 + i5) - 3, i4 - 3, i1 + 6, i2 + 6))
        {
          int i7 = -1;
          switch (i6)
          {
          case 0: 
            i7 = 49;
            break;
          case 1: 
            i7 = 51;
            break;
          case 2: 
            i7 = 55;
            break;
          case 3: 
            i7 = 57;
          }
          this.cJ.a(i7);
        }
      }
    }
  }
  

  // 可能是一个扣除经验或金钱的算法 
  public static int jdMethod_if(int paramInt1, int paramInt2) {
    // 如果a大于等于b返回a
    if (paramInt1 >= paramInt2) {
        return paramInt1;
    }
    // 随机一个long类型的数用作随机种子
    //含参构造方法是以一个固定值作为种子
    Random localRandom = new Random(A.nextLong());
    //
    int i1 = localRandom.nextInt();
    localRandom = null;
    // 如果随机数小于0则 取反变成整数>=0  很大的整数
    if (i1 < 0) {
        i1 = -i1;
    }
    // 取余数后加a 让最终值保持在a的值左右  大概就是最低都会扣1个数值的经验或金钱
    //i1是一个很大的基数 当角色等级越大的时候 相除后得出的余数数值就越大
    // 可能是一个扣除经验或金钱的算法 
    i1 = i1 % (paramInt2 + 1 - paramInt1) + paramInt1;
    return i1;
}

  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
  {
    a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2, true);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    if ((paramInt3 <= 0) || (paramInt4 <= 0)) {
      return;
    }
    if (paramBoolean)
    {
      this.fj.setColor(b2[5][1]);
      this.fj.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    this.fj.setColor(paramInt5);
    if (paramLong2 > paramLong1) {
      paramLong2 = paramLong1;
    }
    if ((paramLong1 > 0L) && (paramLong2 > 0L)) {
      this.fj.fillRect(paramInt1, paramInt2, (int)(paramInt3 * paramLong2 / paramLong1), paramInt4);
    }
    this.fj.setColor(0);
    this.fj.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  //这里进行了存档处理
  //调用这个函数就会处理  继承冒泡
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    int i1 = paramInt3;
    a(paramInt1, paramInt2, i1, 6, paramInt4, paramInt5, paramInt6);
    if (paramBoolean) {
      a(paramInt1, paramInt2 + 7, paramInt6, 20);
    }
  }
  
  //这里进行了存档处理
  //调用这个函数就会处理   继承冒泡
  public void F()
  {
    int i1 = 20;
    a((byte)2, i1, 0, 57, dh.length * eA + 4, true);
    for (int i2 = 0; i2 < dh.length; i2++)
    {
      if (i2 == this.cJ.fQ)
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 3, 2 + i2 * eA, 51, eA);
      }
      this.fj.setColor(b2[2][1]);
      if (i2 == this.cJ.fQ) {
        this.fj.setColor(b2[2][0]);
      }
      this.fj.drawString(dh[i2], i1 + 15, 2 + i2 * eA, 20);
      if (this.cJ.jdField_do == 1) {
        jdMethod_if(i1 + 5, 2 + i2 * eA, i2);
      }
    }
  }
  
  //存档相关
  //处理存档并返回相关的状态值 
  //暂时未知可用来做什么
  public int jdMethod_do(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 4: 
    case 5: 
    case 6: 
      return 0;
    }
    int i1 = paramInt1 - 48;
    switch (i1)
    {
    case 1: 
      i1 = 1;
      break;
    case 3: 
      i1 = 2;
      break;
    case 7: 
      i1 = 3;
      break;
    case 9: 
      i1 = 4;
      break;
    case 0: 
      i1 = 5;
      break;
    case 2: 
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    default: 
      i1 = -1;
    }
    if (i1 >= paramInt2) {
      i1 = -1;
    }
    return i1;
  }
  
  //这里有一个更新存档
  public void jdMethod_if(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt3 < 1) || (paramInt3 > 5)) {
      return;
    }
    int i1 = 0;
    switch (paramInt3)
    {
    case 1: 
      i1 = 1;
      break;
    case 2: 
      i1 = 3;
      break;
    case 3: 
      i1 = 7;
      break;
    case 4: 
      i1 = 9;
    }
    a(paramInt1, paramInt2 + eA / 2 - 3, i1, 20);
  }
  
  public void jdMethod_if(boolean paramBoolean)
  {
    int i1 = Math.min(191, dU) - 114;
    int i2 = 57;
    int i3 = Math.min((this.cJ.fQ + this.cJ.f3) * eA, fp - this.cJ.cz.length * eA - 5);
    a((byte)2, i1 + 57, i3, i2, this.cJ.cz.length * eA + 4, true);
    for (int i4 = 0; i4 < this.cJ.cz.length; i4++)
    {
      if (((i4 == 0) || (i4 == 1) || (i4 == 3)) && (this.cZ.fL < 0)) {
        this.fj.setColor(b2[5][0]);
      } else {
        this.fj.setColor(b2[2][1]);
      }
      if ((i4 == this.cJ.l4) && (paramBoolean))
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 61, 3 + i3 + i4 * eA, i2 - 6, eA - 2);
        this.fj.setColor(b2[2][0]);
      }
      String str = this.cJ.cz[i4];
      this.fj.drawString(str, i1 + 73, 1 + i3 + i4 * eA, 20);
      if (paramBoolean) {
        jdMethod_if(i1 + 63, 1 + i3 + i4 * eA, i4);
      }
    }
  }
  
  public void jdMethod_for(boolean paramBoolean)
  {
    int i1 = Math.min(191, dU) - 114;
    int i2 = 57;
    int i3 = Math.min((this.cJ.fQ + this.cJ.f3) * eA, fp - this.cJ.mv.length * eA - 5);
    a((byte)2, i1 + 57, i3, i2, this.cJ.mv.length * eA + 4, true);
    for (int i4 = 0; i4 < this.cJ.mv.length; i4++)
    {
      this.fj.setColor(b2[2][1]);
      if ((i4 == this.cJ.kk) && (paramBoolean))
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 61, 3 + i3 + i4 * eA, i2 - 6, eA - 2);
        this.fj.setColor(b2[2][0]);
      }
      String str = this.cJ.mv[i4];
      this.fj.drawString(str, i1 + 73, 1 + i3 + i4 * eA, 20);
      if (paramBoolean) {
        jdMethod_if(i1 + 63, 1 + i3 + i4 * eA, i4);
      }
    }
  }
  
  public void jdMethod_new(boolean paramBoolean)
  {
    int i1 = Math.min(191, dU) - 114;
    int i2 = 57;
    int i3 = Math.min((this.cJ.fQ + this.cJ.f3) * eA, fp - this.cJ.iQ.length * eA - 5);
    a((byte)2, i1 + 57, i3, i2, this.cJ.iQ.length * eA + 4, true);
    for (int i4 = 0; i4 < this.cJ.iQ.length; i4++)
    {
      this.fj.setColor(b2[2][1]);
      if ((i4 == this.cJ.mj) && (paramBoolean))
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 61, 3 + i3 + i4 * eA, i2 - 6, eA - 2);
        this.fj.setColor(b2[2][0]);
      }
      String str = this.cJ.iQ[i4];
      this.fj.drawString(str, i1 + 73, 1 + i3 + i4 * eA, 20);
      if (paramBoolean) {
        jdMethod_if(i1 + 63, 1 + i3 + i4 * eA, i4);
      }
    }
  }
  
  public void jdMethod_int(boolean paramBoolean)
  {
    int i1 = Math.min(191, dU) - 114;
    int i2 = 57;
    int i3 = Math.min((this.cJ.fQ + this.cJ.f3) * eA, fp - this.cJ.ke.length * eA - 5);
    a((byte)2, i1 + 57, i3, i2, this.cJ.ke.length * eA + 4, true);
    for (int i4 = 0; i4 < this.cJ.ke.length; i4++)
    {
      this.fj.setColor(b2[2][1]);
      if ((i4 == this.cJ.nd) && (paramBoolean))
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 61, 3 + i3 + i4 * eA, i2 - 6, eA - 2);
        this.fj.setColor(b2[2][0]);
      }
      String str = this.cJ.ke[i4];
      this.fj.drawString(str, i1 + 73, 1 + i3 + i4 * eA, 20);
      if (this.cJ.jdField_do == 56) {
        jdMethod_if(i1 + 63, 1 + i3 + i4 * eA, i4);
      }
    }
  }
  
  public void jdMethod_do(boolean paramBoolean)
  {
    int i1 = 20;
    int i2 = 57;
    int i3 = Math.min(this.cJ.fQ * eA, fp - cg[this.cJ.fQ].length * eA - 5);
    a((byte)2, i1 + 57, i3, i2, cg[this.cJ.fQ].length * eA + 4, true);
    for (int i4 = 0; i4 < cg[this.cJ.fQ].length; i4++)
    {
      this.fj.setColor(b2[2][1]);
      if ((this.cJ.fQ == 2) && (i4 == 1) && (!this.cZ.gE)) {
        this.fj.setColor(b2[5][0]);
      }
      if ((this.cJ.fQ == 1) && (i4 == 1)) {
        this.fj.setColor(b2[5][0]);
      }
      if ((i4 == this.cJ.f3) && (paramBoolean))
      {
        this.fj.setColor(b2[2][1]);
        this.fj.fillRect(i1 + 60, 3 + i3 + i4 * eA, i2 - 6, eA - 2);
        this.fj.setColor(b2[2][0]);
      }
      String str = null;
      if ((this.cJ.fQ == 0) && (i4 == 3))
      {
        if ((this.cZ.a8) && (this.cZ.d == 0))
        {
          str = "撤摊";
        }
        else
        {
          str = "摆摊";
          if ((this.cZ.a8) && (this.cZ.d != 0)) {
            this.fj.setColor(b2[5][0]);
          }
        }
      }
      else if ((this.cJ.fQ == 1) && (i4 == 2))
      {
        if ((this.cZ.a8) && (this.cZ.d == 1))
        {
          str = "撤摊";
        }
        else
        {
          str = "摆摊";
          if ((this.cZ.a8) && (this.cZ.d != 1))
          {
            this.fj.setColor(b2[5][0]);
          }
          else
          {
            int i5 = 0;
            for (int i6 = 0; i6 < this.jdField_try; i6 = (byte)(i6 + 1)) {
              if (this.b7[i6].a((byte)12) == 0) {
                i5 = 1;
              }
            }
            if (i5 == 0) {
              this.fj.setColor(b2[5][0]);
            }
          }
        }
      }
      else {
        str = cg[this.cJ.fQ][i4];
      }
      this.fj.drawString(str, i1 + 73, 1 + i3 + i4 * eA, 20);
      if (this.cJ.jdField_do == 2) {
        jdMethod_if(i1 + 63, 1 + i3 + i4 * eA, i4);
      }
    }
  }
  
  public void x()
  {
    a(2, fp - 2 - this.aH[3].getHeight(), this.aH[3].getWidth() / 2, this.aH[3].getHeight(), 0, 0, this.aH[3], 0);
  }
  
  public void c()
  {
    a(dU - 2 - this.aH[3].getWidth() / 2, fp - 2 - this.aH[3].getHeight(), this.aH[3].getWidth() / 2, this.aH[3].getHeight(), this.aH[3].getWidth() / 2, 0, this.aH[3], 0);
  }
  
  public void a(byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i1 = paramByte;
    if (paramBoolean)
    {
      this.fj.setColor(b2[5][1]);
      this.fj.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    this.fj.setColor(b2[2][1]);
    this.fj.drawRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1);
    this.fj.setColor(b2[5][1]);
    this.fj.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2 - 1, paramInt4 - 2 - 1);
    this.fj.setColor(b2[2][1]);
    this.fj.drawRect(paramInt1 + 2, paramInt2 + 2, paramInt3 - 4 - 1, paramInt4 - 4 - 1);
    a(paramInt1, paramInt2, this.aH[i1].getWidth(), this.aH[i1].getHeight(), 0, 0, this.aH[i1], 0);
    a(paramInt1 + paramInt3 - this.aH[i1].getWidth(), paramInt2, this.aH[i1].getWidth(), this.aH[i1].getHeight(), 0, 0, this.aH[i1], 2);
    a(paramInt1, paramInt2 + paramInt4 - this.aH[i1].getHeight(), this.aH[i1].getWidth(), this.aH[i1].getHeight(), 0, 0, this.aH[i1], 1);
    a(paramInt1 + paramInt3 - this.aH[i1].getWidth(), paramInt2 + paramInt4 - this.aH[i1].getHeight(), this.aH[i1].getWidth(), this.aH[i1].getHeight(), 0, 0, this.aH[i1], 3);
  }
  
  public boolean a(String paramString, int paramInt, byte paramByte, boolean paramBoolean)
  {
    String[] arrayOfString = null;
    int i1 = 0;
    if (paramString == null)
    {
      this.dk = null;
      return true;
    }
    int i2 = fp / 10;
    int i3 = 8947848;
    int i4 = 4473924;
    int i5 = 3;
    int i6 = 4;
    int i7 = 5;
    int i8 = (short)(dU / 10);
    int i9 = (short)i2;
    int i10 = (short)(dU * 4 / 5);
    int i11 = (short)(eA * i6 + i5 * i6 + i7 * 2);
    int i12 = (short)(i8 + i7);
    int i13 = (short)(i9 + i7);
    int i14 = (short)(i10 - 2 * i7);
    if (paramInt < 0)
    {
      g.gf = 0;
      if (this.dk != null) {
        this.dk = null;
      }
      arrayOfString = jdMethod_do(paramString, i14);
      i1 = arrayOfString.length;
    }
    else
    {
      if ((this.dk == null) || (paramString.indexOf(this.dk[0]) == -1))
      {
        this.dk = jdMethod_do(paramString, i14);
        this.U = this.dk.length;
      }
      arrayOfString = this.dk;
      i1 = this.U;
    }
    this.fj.setColor(i4);
    this.fj.fillRect(i8 + 3, i9 + 3, i10, i11);
    this.fj.setColor(i3);
    this.fj.drawLine(i8 + 3, i9 + 3, i8 + 3 + i10, i9 + 3);
    this.fj.drawLine(i8 + 3, i9 + 3, i8 + 3, i9 + 3 + i11);
    this.fj.setColor(2236962);
    this.fj.drawLine(i8 + 3 + i10, i9 + 3, i8 + 3 + i10, i9 + 3 + i11);
    this.fj.drawLine(i8 + 3, i9 + 3 + i11, i8 + 3 + i10, i9 + 3 + i11);
    int i15;
    int i16;
    if (!paramBoolean)
    {
      i15 = i1 / i6;
      if (i15 * i6 < i1) {
        i15++;
      }
      if (paramInt >= i15)
      {
        g.gf = (byte)(i15 - 1);
        return true;
      }
      for (i16 = 0; (i16 < i6) && (g.gf * i6 + i16 < i1); i16++)
      {
        this.fj.setColor(b2[2][0]);
        this.fj.drawString(arrayOfString[(g.gf * i6 + i16)], i12, i13 + i16 * (eA + i5), 0);
      }
      if ((paramByte >= 0) && (this.aH[paramByte] != null) && (g.gf < i15)) {
        a(i8 + i10 - 12, i9 + i11 - (this.cJ.jdField_int % 5 != 0 ? 6 : 5), 14, 8, 0, 0, this.aH[paramByte], 3);
      }
    }
    else
    {
      i15 = this.cJ.jdField_int / 10 % (i1 + i6);
      if (i15 == i1 + i6 - 1)
      {
        this.dk = null;
        return true;
      }
      for (i16 = 0; i16 < i6; i16++)
      {
        int i17 = i15 - i6 + i16 + 1;
        if ((i17 >= 0) && (i17 < i1))
        {
          this.fj.setColor(b2[2][0]);
          this.fj.drawString(arrayOfString[i17], i12, i13 + i16 * (eA + i5), 0);
        }
      }
    }
    return false;
  }
  
  public void a(int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    int i1 = 7;
    int i2 = 5;
    if ((paramInt3 & 0x3C) != 0)
    {
      int i3 = 1;
      long l1 = Math.abs(paramLong);
      while (l1 > 9L)
      {
        l1 /= 10L;
        i3++;
      }
      if ((paramInt3 & 0x8) != 0) {
        paramInt1 -= i2 * i3;
      }
      if ((paramInt3 & 0x20) != 0) {
        paramInt2 -= i1;
      }
      if (paramLong < 0L) {
        a(paramInt1 - i2, paramInt2, i2, this.aH[5].getHeight(), 15 * i2, 0, this.aH[5], 0);
      }
      for (int i4 = 0; i4 < i3; i4++)
      {
        int i5 = (int)Math.abs(paramLong % 10L);
        paramLong /= 10L;
        a(paramInt1 + (i3 - 1 - i4) * i2, paramInt2, i2, i1, i5 * i2, 0, this.aH[5], 0);
      }
    }
  }
  
  //读取相关文本数据
  public void i()
  {
    InputStream localInputStream = null;
    try
    {
      if (bg == null)
      {
        localInputStream = getClass().getResourceAsStream("/sot_item.name");
        bg = new byte[localInputStream.available()];
        localInputStream.read(bg);
        localInputStream.close();
      }
      if (J == null)
      {
        localInputStream = getClass().getResourceAsStream("/sot_item.expl");
        J = new byte[localInputStream.available()];
        localInputStream.read(J);
        localInputStream.close();
      }
      if (Q == null)
      {
        localInputStream = getClass().getResourceAsStream("/skill.name");
        Q = new byte[localInputStream.available()];
        localInputStream.read(Q);
        localInputStream.close();
      }
      return;
    }
    catch (Exception localException2)
    {
      a(localException2);
    }
    finally
    {
      try
      {
        localInputStream.close();
        localInputStream = null;
      }
      catch (Exception localException4) {}
    }
  }
  
  protected h(SFMIDlet paramSFMIDlet)
  {
    super(false);
    setFullScreenMode(true);
    this.fG = paramSFMIDlet;
    fp = (short)getHeight();
    dU = (short)getWidth();
    if (dU < 176) {
      a9 = 0;
    } else if ((dU >= 176) && (dU < 240)) {
      a9 = 1;
    } else {
      a9 = 2;
    }
    DataInputStream localDataInputStream = null;
    try
    {
      String str1 = this.fG.getAppProperty(s.a(39));
      String str3 = this.fG.getAppProperty(s.a(40));
      str3 = str3.substring(0, str3.indexOf(","));
      localDataInputStream = new DataInputStream(getClass().getResourceAsStream("/code"));
      bL = localDataInputStream.readUTF().trim();
      if ((bL == null) || (bL.trim().length() == 0)) {
        bL = "10";
      }
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        localDataInputStream = null;
      }
      catch (Exception localException1) {}
      str2 = jdMethod_if();
    }
    catch (Exception localException2) {}finally
    {
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        localDataInputStream = null;
      }
      catch (Exception localException7) {}
    }
    String str2;
    if (str2 != null) {
      bL = str2;
    }
    if (bL == null) {
      bL = "10";
    }
    if (bL.equals("71")) {
      cz = true;
    }
    if (bL.equals("77")) {
      cc = "113.106.98.37:8080";
    }
    if (cz)
    {
      cg = new String[][] { { "道具", "技能", "属性", "摆摊", "任务" }, { "宠物", "技能", "交易" }, { "附近", "队伍", "公会", "请求", "排行" }, { "发言", "好友", "屏蔽", "记录" }, { "新品", "常规" }, { "设置", "复位", "帮助", "客服", "退出" } };
      bB = "http://wap.baidu.com/fengyun/fengyun_game_index.jsp?statcms=index_game&ssid=0&from=0&bd_page_type=1&uid=1260872485827_869&pu=pd@1,sz@176_208,uc@0";
    }
    if (bL.equals("79")) {
      bB = "http://189hi.cn";
    }
    if (bL.equals("12")) {
      bB = "http://d.cn";
    } else if (bL.equals("67")) {
      bB = "http://wap.17sy.com";
    }
    jdMethod_for(1, a9);
    try
    {
      localDataInputStream = new DataInputStream(getClass().getResourceAsStream("/logo/" + bL + "/pre.png"));
      if ((localDataInputStream != null) && (localDataInputStream.available() > 0)) {
        this.an = true;
      }
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        localDataInputStream = null;
      }
      catch (Exception localException4) {}
      this.aH = new Image[20];
    }
    catch (Exception localException5)
    {
      this.an = false;
    }
    finally
    {
      try
      {
        if (localDataInputStream != null) {
          localDataInputStream.close();
        }
        localDataInputStream = null;
      }
      catch (Exception localException8) {}
    }
    this.bV = new x(this);
    this.cl = new x[2];
    this.cl[0] = new x(this);
    this.cl[1] = new x(this);
    this.S = new as(this);
    this.s = new y();
    this.cJ = new g();
    this.i = new ah(this);
    this.bR = new ak(this);
    this.cZ = new ag(this);
    i();
    j();
    this.s.a(this);
    this.bj = this.s;
  }
  
  public void M()
  {
    this.o = x.a(new DataInputStream(getClass().getResourceAsStream("/boy.mod")));
    this.cJ.li = new ag[5];
    for (int i1 = 0; i1 < this.cJ.li.length; i1 = (byte)(i1 + 1))
    {
      this.cJ.li[i1] = new ag(this);
      this.cJ.li[i1].jdMethod_if(this.b0);
    }
    this.dF = new x(this);
    this.dF.a("/skill.dat");
    this.bt = h("/skill.yy");
  }
  
  public void a(ap paramap1, ap paramap2)
  {
    paramap1.a();
    if (paramap1 == this.s)
    {
      this.s = null;
      Runtime.getRuntime().gc();
      this.B = new a8(this);
    }
    if (paramap2 == this.s)
    {
      q.cB = 0;
      this.s = new y();
      paramap2 = this.s;
    }
    paramap2.a(this);
    this.bj = paramap2;
    if (paramap2 == this.s)
    {
      this.cZ = new ag(this);
      this.cJ = new g();
      this.i = new ah(this);
      this.bR = new ak(this);
      c7 = new boolean[6];
    }
    Runtime.getRuntime().gc();
  }
  
  //读取MANIFEST.MF文件
  public String jdMethod_if()
  {
    try
    {
      InputStream localInputStream = getClass().getResourceAsStream("/META-INF/MANIFEST.MF");
      byte[] arrayOfByte = new byte[localInputStream.available()];
      localInputStream.read(arrayOfByte);
      String str1 = new String(arrayOfByte);
      String str2 = "Mc-ID:";
      int i1 = str1.indexOf(str2);
      String str3 = null;
      if (i1 > 0) {
        str3 = str1.substring(i1 + str2.length(), i1 + str2.length() + 4).trim();
      }
      return str3;
    }
    catch (Exception localException) {}
    return null;
  }
  
  //生成图片
  //可能是解密函数
  //参数1 路径
  Image h(String paramString)
  {
    InputStream localInputStream = getClass().getResourceAsStream(paramString);
    byte[] arrayOfByte1 = null;
    try
    {
      //打开文件
      DataInputStream localDataInputStream = new DataInputStream(localInputStream);
      int i1 = 0;
      //读取文件前4个字节 到i1  应该是长度
      i1 = localDataInputStream.readInt();
      //创建一个i1大的字节流
      byte[] arrayOfByte2 = new byte[i1];
      //读取文件流存到arrayOfByte2变量中
      //参数1 存放变量
      //参数2 开始读取位置
      //参数3 读取长度
      localInputStream.read(arrayOfByte2, 0, arrayOfByte2.length);
      //创建一个新的数据流 大小加上gj.length    gj应该是一个标识
      arrayOfByte1 = new byte[i1 + gj.length];
      //把gj中的数据拷贝到arrayOfByte1中
      System.arraycopy(gj, 0, arrayOfByte1, 0, gj.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, gj.length, arrayOfByte2.length);
      if (localInputStream != null)
      {
        localDataInputStream.close();
        localInputStream.close();
      }
    }
    catch (Exception localException) {}
    return Image.createImage(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  Image jdMethod_goto(String paramString)
  {
    InputStream localInputStream = getClass().getResourceAsStream(paramString);
    arrayOfByte1 = null;
    try
    {
      int i1 = 0;
      i1 = (short)(i1 << 16);
      i1 = (short)(i1 | localInputStream.read() & 0xFF);
      i1 = (short)(i1 << 8);
      i1 = (short)(i1 | localInputStream.read() & 0xFF);
      byte[] arrayOfByte2 = new byte[i1];
      localInputStream.read(arrayOfByte2, 0, arrayOfByte2.length);
      arrayOfByte1 = new byte[i1 + gj.length];
      System.arraycopy(gj, 0, arrayOfByte1, 0, gj.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, gj.length, arrayOfByte2.length);
      return Image.createImage(arrayOfByte1, 0, arrayOfByte1.length);
    }
    catch (Exception localException2) {}finally
    {
      try
      {
        localInputStream.close();
        localInputStream = null;
      }
      catch (Exception localException4) {}
    }
  }
  
  Image jdMethod_do(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
    byte[] arrayOfByte1 = null;
    try
    {
      int i1 = 0;
      i1 = (short)(i1 << 16);
      i1 = (short)(i1 | localDataInputStream.read() & 0xFF);
      i1 = (short)(i1 << 8);
      i1 = (short)(i1 | localDataInputStream.read() & 0xFF);
      byte[] arrayOfByte2 = new byte[i1];
      localDataInputStream.readFully(arrayOfByte2, 0, arrayOfByte2.length);
      arrayOfByte1 = new byte[i1 + gj.length];
      System.arraycopy(gj, 0, arrayOfByte1, 0, gj.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, gj.length, arrayOfByte2.length);
      arrayOfByte2 = null;
      if (localByteArrayInputStream != null)
      {
        localByteArrayInputStream.close();
        localByteArrayInputStream = null;
      }
      if (localDataInputStream != null)
      {
        localDataInputStream.close();
        localDataInputStream = null;
      }
    }
    catch (Exception localException) {}
    return Image.createImage(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  public void paint(Graphics paramGraphics)
  {
    this.fj = paramGraphics;
    paramGraphics.setFont(dA);
    this.bj.jdMethod_if();
    paramGraphics.setColor(0);
    paramGraphics.fillRect(dU, 0, getWidth() - dU, getHeight());
    if (this.bj != this.cJ) {
      paramGraphics.fillRect(0, fp, dU, getHeight() - fp);
    }
    fv = false;
  }
  
  public void t()
  {
    ft = new Timer();
    h.a locala = new h.a(null);
    ft.schedule(locala, 0L, bn);
  }
  
  public void O()
  {
    ft.cancel();
    ft = null;
  }
  
  public void jdMethod_new()
  {
    bi = true;
  }
  
  public void a(short paramShort1, short paramShort2, short paramShort3)
  {
    this.cT = paramShort1;
    this.aN = new short[paramShort1];
    this.aK = new short[paramShort1];
    this.c8 = new byte[paramShort1];
    for (int i1 = 0; i1 < this.aN.length; i1 = (byte)(i1 + 1))
    {
      this.aN[i1] = ((short)jdMethod_if(1, paramShort2 - 1));
      this.aK[i1] = ((short)jdMethod_if(1, paramShort3 - 1));
      this.c8[i1] = ((byte)jdMethod_if(0, p.length - 1));
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((this.aN == null) || (this.aK == null)) {
      return;
    }
    for (int i1 = 0; i1 < this.cT; i1 = (byte)(i1 + 1)) {
      if (a(this.aN[i1], this.aK[i1], 1, 1, paramInt1, paramInt2, paramInt3, paramInt4))
      {
        this.fj.setColor(p[this.c8[i1]]);
        if (paramInt5 % jdMethod_if(5, 15) == 0) {
          this.c8[i1] = ((byte)((this.c8[i1] + 1) % p.length));
        }
        this.fj.fillRect(this.aN[i1] - paramInt1, this.aK[i1] - paramInt2, 1, 1);
      }
    }
  }
  
  public void E()
  {
    this.aN = null;
    this.aK = null;
    this.c8 = null;
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Image paramImage, int paramInt7)
  {
    paramGraphics.drawRegion(paramImage, paramInt5, paramInt6, paramInt3, paramInt4, paramInt7, paramInt1, paramInt2, 20);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Image paramImage, int paramInt7)
  {
    a(this.fj, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramImage, paramInt7);
  }
  
  protected void keyPressed(int paramInt)
  {
    this.bj.jdMethod_if(a(Math.abs(paramInt)));
  }
  
  protected void keyReleased(int paramInt)
  {
    this.bj.a(a(Math.abs(paramInt)));
  }
  
  private int a(int paramInt)
  {
    switch (paramInt)
    {
    case 42: 
      if ((this.bj != this.cJ) || (this.cJ.jdField_do != 0)) {
        return 6;
      }
      return paramInt;
    case 35: 
      if ((this.bj != this.cJ) || ((this.cJ.jdField_do != 0) && (this.cJ.jdField_do != 15))) {
        return 7;
      }
      return paramInt;
    case 50: 
      return 1;
    case 56: 
      return 2;
    case 52: 
      return 3;
    case 54: 
      return 4;
    case 53: 
      return 5;
    }
    return paramInt;
  }
  
  public byte a(String paramString, int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    byte b10 = 0;
    while (i2 <= paramString.length())
    {
      while ((i2 <= paramString.length()) && (dA.stringWidth(paramString.substring(i1, i2)) <= paramInt)) {
        i2 = (short)(i2 + 1);
      }
      b10 = (byte)(b10 + 1);
      i2 = (short)(i2 - 1);
      i2 = (short)(i2 + 1);
      i1 = i2;
    }
    return b10;
  }
  
  public void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.fj.drawRGB(paramArrayOfInt, 0, 0, paramInt1, paramInt2, paramInt3, paramInt4, true);
  }
  
  public void a(int paramInt1, int paramInt2, DataInputStream paramDataInputStream)
  {
    this.bj.a(paramInt1, paramInt2, paramDataInputStream);
  }
  
  //出现绘制函数
  // 参数1 绘制文字
  // 参数2 状态?
  // 参数34  绘制位置xy？
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.fj == null) || (paramString == null)) {
      return;
    }
    if (aL)
    {
      //设置字体颜色
      this.fj.setColor(0);
      //绘制到屏幕中
      this.fj.drawString(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3);
    }
    this.fj.setColor(paramInt4);
    this.fj.drawString(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  public void k(String paramString)
  {
    this.cb += 1;
    this.fj.setColor(0);
    this.fj.fillRect(0, 0, dU, fp);
    this.fj.setColor(21760 - 1280 * Math.abs(10 - this.cb / 2 % 20));
    int i1 = 0;
    while (i1 < dU)
    {
      this.fj.drawLine(i1 + 3, 0, i1 + 3, fp);
      i1 += 10;
    }
    i1 = 0;
    while (i1 < fp)
    {
      this.fj.drawLine(0, i1 + 5, dU, i1 + 5);
      i1 += 10;
    }
    this.fj.setColor(26112 + 1118481 * Math.abs(4 - this.cb % 8));
    this.fj.drawLine(3 + this.cb * 10 % dU, 0, 3 + this.cb * 10 % dU, fp);
    if (this.cJ.jdField_do == 5)
    {
      if (a(paramString, g.gf, (byte)4, false)) {
        g.gf = 0;
      }
    }
    else {
      a(paramString, -1, (byte)-1, false);
    }
  }
  
  public void a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.fj.setColor(b2[2][1]);
    this.fj.drawRect(paramInt1 + 4, paramInt2 + 4, 6, 6);
    if (paramBoolean)
    {
      this.fj.setColor(b2[4][1]);
      this.fj.fillRect(paramInt1 + 6, paramInt2 + 6, 4, 4);
    }
    this.fj.drawString(paramString, paramInt1 + 14, paramInt2, 0);
  }
  
  public void a(byte paramByte1, byte paramByte2, byte paramByte3, String[] paramArrayOfString, String[][] paramArrayOfString1, byte[] paramArrayOfByte)
  {
    int i1 = 3;
    int i2 = 3;
    int i3 = dU / 4 - 1;
    for (byte b10 = paramByte1; b10 < paramByte1 + paramByte2; b10++) {
      if (b10 < paramByte3)
      {
        int i4 = i2 + b10 * 36;
        if (i4 + 36 > fp) {
          i4 = i2 + b10 % (fp / 36) * 36;
        }
        this.fj.setColor(b2[2][1]);
        this.fj.drawString(paramArrayOfString[b10], i1, i4, 0);
        int i5 = paramArrayOfString1[b10].length;
        switch (i5)
        {
        case 2: 
          i3 = 60;
          break;
        case 3: 
          i3 = dU / 3 - 2;
        }
        for (int i6 = 0; i6 < i5; i6++) {
          a(paramArrayOfString1[b10][i6], i6 == paramArrayOfByte[b10], i1 + i6 * i3, i4 + 18);
        }
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte, String[] paramArrayOfString)
  {
    a(paramInt1, paramInt2, paramByte, paramArrayOfString, true);
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte, String[] paramArrayOfString, boolean paramBoolean)
  {
    int i1 = 0;
    int i2 = 1;
    byte b10 = paramArrayOfString.length;
    if ((b10 > 7) && (paramBoolean))
    {
      b10 /= 2;
      i2 = 2;
    }
    for (byte b11 = 0; b11 < paramArrayOfString.length; b11++) {
      if (dA.stringWidth(paramArrayOfString[b11]) > i1) {
        i1 = dA.stringWidth(paramArrayOfString[b11]);
      }
    }
    paramInt1 = Math.max(Math.min(paramInt1, dU - i1 * (i2 > 1 ? 3 : 1) - 15), 10);
    paramInt2 = Math.min(paramInt2, fp - b10 * eA - 10);
    if (i2 > 1) {
      a((byte)2, paramInt1 + i1 + 11, paramInt2, i1 + 14, b10 * (eA + 2) + 6, true);
    }
    a((byte)2, paramInt1 - 8, paramInt2, i1 + 22, b10 * (eA + 2) + 6, true);
    for (b11 = 0; b11 < i2; b11++) {
      for (byte b12 = 0; b12 < b10; b12++)
      {
        this.fj.setColor(b2[2][1]);
        if (this.cJ.jdField_do == 27)
        {
          switch (this.cJ.j1)
          {
          case -91: 
            if ((b12 == 1) && ((!ag.jdMethod_do(this.cZ.fj, (byte)0)) || (this.cJ.hZ == 0))) {
              this.fj.setColor(b2[5][0]);
            }
            break;
          case 104: 
            if ((b12 <= 2) && (this.cJ.es == 0)) {
              this.fj.setColor(b2[5][0]);
            }
            if ((b12 == 2) && (!ag.jdMethod_do(this.cZ.fj, (byte)1))) {
              this.fj.setColor(b2[5][0]);
            }
            if ((b12 == 3) && (!ag.jdMethod_do(this.cZ.fj, (byte)4))) {
              this.fj.setColor(b2[5][0]);
            }
            if ((b12 == 3) && (((Byte)this.cJ.k1.elementAt(this.cJ.hZ)).byteValue() >= this.cZ.fj)) {
              this.fj.setColor(b2[5][0]);
            }
            break;
          case 16: 
            if ((!this.cJ.mc) && (this.cJ.es != 65535))
            {
              if ((3 == b12 + b11 * b10) && (this.cZ.gE)) {
                this.fj.setColor(b2[5][0]);
              }
              if (2 == b12 + b11 * b10) {
                if (this.cZ.fL >= 0)
                {
                  if ((this.cJ.bA == -1) || (this.cJ.bA == this.cZ.fL))
                  {
                    if ((!this.fI) || (1 == h((short)this.cJ.es)) || (!M((short)this.cJ.es))) {
                      this.fj.setColor(b2[5][0]);
                    }
                  }
                  else if ((this.cJ.bA != this.cZ.fL) && ((!this.fI) || (1 == h((short)this.cJ.es)))) {
                    this.fj.setColor(b2[5][0]);
                  }
                }
                else if ((!this.fI) || (!M((short)this.cJ.es)) || (1 == h((short)this.cJ.es))) {
                  this.fj.setColor(b2[5][0]);
                }
              }
              if ((8 == b12 + b11 * b10) && ((!this.fI) || (!M((short)this.cJ.es)) || (1 == h((short)this.cJ.es)) || (g.dD != 1) || (g.dZ != 0))) {
                this.fj.setColor(b2[5][0]);
              }
              if ((9 == b12 + b11 * b10) && ((this.cZ.fL >= 0) || (!this.cJ.bj))) {
                this.fj.setColor(b2[5][0]);
              }
            }
            break;
          case 28: 
            if ((!this.cJ.gL) && ((b12 == 0) || (b12 == 1) || (b12 == 2)) && (this.cJ.es == 0)) {
              this.fj.setColor(b2[5][0]);
            }
            break;
          }
        }
        else if (this.cJ.jdField_do == -85)
        {
          b13 = ((Byte)this.cJ.k1.elementAt(this.cJ.hZ)).byteValue();
          Integer localInteger = (Integer)this.cJ.dY.elementAt(this.cJ.hZ);
          i4 = localInteger.byteValue();
          if ((b13 >= 0) && (b13 == this.cJ.mQ[b12])) {
            this.fj.setColor(b2[5][0]);
          } else if ((this.cJ.mQ[b12] >= 0) && (i4 < ag.jdMethod_case(this.cJ.mQ[b12]))) {
            this.fj.setColor(b2[5][0]);
          }
        }
        else if (this.cJ.jdField_do == 100)
        {
          if ((b12 == 0) && (!this.bR.a(this.ck.jdField_try[(this.ck.jdField_for + this.ck.jdField_long)].E)) && (((this.ck.jdField_new == 0) && (this.bR.jdMethod_if())) || ((this.ck.jdField_new == 2) && (this.bR.jdMethod_do((byte)9))) || ((this.ck.jdField_new == 1) && (this.bR.jdMethod_do((byte)7))) || ((this.ck.jdField_new == 3) && (this.bR.jdMethod_do((byte)8))))) {
            this.fj.setColor(b2[5][0]);
          }
        }
        else if (this.cJ.jdField_do == 67)
        {
          if ((b12 == 1) && (!this.bR.a(this.ck.jdField_try[(this.ck.jdField_for + this.ck.jdField_long)].E)) && (((this.ck.jdField_new == 0) && (this.bR.jdMethod_if())) || ((this.ck.jdField_new == 2) && (this.bR.jdMethod_do((byte)9))) || ((this.ck.jdField_new == 1) && (this.bR.jdMethod_do((byte)7))) || ((this.ck.jdField_new == 3) && (this.bR.jdMethod_do((byte)8))))) {
            this.fj.setColor(b2[5][0]);
          }
        }
        else if (this.cJ.jdField_do == 32)
        {
          if ((b12 == 0) && (this.cZ.a7[this.cJ.gp] == -1)) {
            this.fj.setColor(b2[5][0]);
          }
          if ((b12 == 1) && (this.cZ.a7[this.cJ.gp] != -1) && (this.cZ.fc[this.cJ.gp] != 0)) {
            this.fj.setColor(b2[5][0]);
          }
          if ((b12 == 12) && (this.cZ.a7[this.cJ.gp] != -1) && (this.cZ.fc[this.cJ.gp] == 0) && (jdMethod_do(this.cZ.a7[this.cJ.gp]) == 0)) {
            this.fj.setColor(b2[5][0]);
          }
        }
        else if (this.cJ.jdField_do == -35)
        {
          if (b12 == 0)
          {
            if (this.b7[this.cJ.bf].a((byte)12) == 0) {
              this.fj.setColor(b2[5][0]);
            } else if (this.b7[this.cJ.bf].a((byte)40) <= 0) {
              this.fj.setColor(b2[5][0]);
            }
          }
          else if (b12 == 1) {
            switch (this.b7[this.cJ.bf].a((byte)12))
            {
            case 1: 
              if (this.b7[this.cJ.bf].a((byte)40) <= 0) {
                this.fj.setColor(b2[5][0]);
              }
              break;
            }
          } else if (b12 == 2) {
            if (this.b7[this.cJ.bf].a((byte)12) != 2) {
              this.fj.setColor(b2[5][0]);
            } else if (this.b7[this.cJ.bf].a((byte)14) <= 30) {
              this.fj.setColor(b2[5][0]);
            }
          }
        }
        this.fj.drawString(paramArrayOfString[(b12 + b11 * b10)], paramInt1 + 8 + (i1 + 12) * b11, paramInt2 + b12 * (eA + 2) + 4, 20);
        byte b13 = b12;
        int i3 = paramInt1 - 5;
        int i4 = i1 + 16;
        int i5 = i3;
        if (paramByte >= b10)
        {
          b13 += b10;
          i3 = i3 + i1 + 12;
          i4 -= 8;
          i5 = i3 + 7;
        }
        if (paramByte == b13)
        {
          this.fj.setColor(b2[2][1]);
          this.fj.fillRect(i5, paramInt2 + 3 + b12 * (eA + 2), i4, eA + 2);
          this.fj.setColor(b2[2][0]);
          this.fj.drawString(paramArrayOfString[b13], i3 + 13, paramInt2 + b12 * (eA + 2) + 4, 20);
        }
        jdMethod_if(paramInt1 - 2, paramInt2 + b12 * (eA + 2) + 4, b12);
      }
    }
  }
  
  public void D()
  {
    try
    {
      RecordStore localRecordStore = RecordStore.openRecordStore("PLAYER2", true);
      byte[] arrayOfByte = null;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeUTF(this.dv.trim());
      localDataOutputStream.writeUTF(this.dw.trim());
      localDataOutputStream.writeUTF(this.jdField_do.trim());
      localDataOutputStream.writeUTF(aD[this.fA]);
      localDataOutputStream.close();
      localByteArrayOutputStream.close();
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      if (localRecordStore.getNumRecords() == 0) {
        localRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } else {
        localRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
      }
      if (localRecordStore != null) {
        localRecordStore.closeRecordStore();
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public byte a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    int i1 = paramString.length() / paramInt4;
    if (i1 * paramInt4 < paramString.length()) {
      i1++;
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      String str = null;
      if (i2 * paramInt4 + paramInt4 >= paramString.length()) {
        str = paramString.substring(i2 * paramInt4);
      } else {
        str = paramString.substring(i2 * paramInt4, i2 * paramInt4 + paramInt4);
      }
      this.fj.setColor(b2[5][0]);
      this.fj.drawString(str, paramInt1, paramInt2 + i2 * paramInt3, 0);
    }
    return (byte)i1;
  }
  
  public byte a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = paramString.length();
    while (i2 <= i4)
    {
      while ((i2 <= i4) && (dA.stringWidth(paramString.substring(i1, i2)) <= paramInt3)) {
        i2 = (short)(i2 + 1);
      }
      i2 = (short)(i2 - 1);
      i3 = (byte)(i3 + 1);
      this.fj.drawString(paramString.substring(i1, i2), paramInt1, paramInt2 + i3 * eA, 20);
      i2 = (short)(i2 + 1);
      i1 = i2;
    }
    return i3;
  }
  
  private String[] jdMethod_if(String paramString, int paramInt)
  {
    String[] arrayOfString = new String[a(paramString, paramInt)];
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = paramString.length();
    while (i2 <= i4)
    {
      while ((i2 <= i4) && (dA.stringWidth(paramString.substring(i1, i2)) <= paramInt)) {
        i2 = (short)(i2 + 1);
      }
      i3 = (byte)(i3 + 1);
      i2 = (short)(i2 - 1);
      arrayOfString[i3] = paramString.substring(i1, i2);
      i2 = (short)(i2 + 1);
      i1 = i2;
    }
    return arrayOfString;
  }
  
  public String[] jdMethod_do(String paramString, int paramInt)
  {
    String[] arrayOfString = null;
    int i1 = paramString.indexOf("\001");
    for (int i2 = 0; i1 != -1; i2++) {
      i1 = paramString.indexOf("\001", i1 + 1);
    }
    if (i2 > 0)
    {
      int[] arrayOfInt = new int[i2];
      String[][] arrayOfString1 = new String[i2 + 1][];
      int i3 = 0;
      for (int i4 = 0; i4 < i2 + 1; i4++) {
        if (i4 == 0)
        {
          i1 = paramString.indexOf("\001");
          arrayOfInt[0] = i1;
          arrayOfString1[0] = jdMethod_if(paramString.substring(0, i1), paramInt);
          i3 = arrayOfString1[0].length;
        }
        else if (i4 == i2)
        {
          arrayOfString1[i2] = jdMethod_if(paramString.substring(arrayOfInt[(i2 - 1)] + 1), paramInt);
          i3 += arrayOfString1[i2].length;
        }
        else
        {
          i1 = paramString.indexOf("\001", i1 + 1);
          arrayOfInt[i4] = i1;
          arrayOfString1[i4] = jdMethod_if(paramString.substring(arrayOfInt[(i4 - 1)] + 1, arrayOfInt[i4]), paramInt);
          i3 += arrayOfString1[i4].length;
        }
      }
      arrayOfString = new String[i3];
      i4 = 0;
      for (int i5 = 0; i5 < i2 + 1; i5++) {
        if (i5 == 0)
        {
          i4 = arrayOfString1[0].length;
          System.arraycopy(arrayOfString1[0], 0, arrayOfString, 0, i4);
        }
        else
        {
          System.arraycopy(arrayOfString1[i5], 0, arrayOfString, i4, arrayOfString1[i5].length);
          i4 += arrayOfString1[i5].length;
        }
      }
    }
    else
    {
      arrayOfString = jdMethod_if(paramString, paramInt);
    }
    return arrayOfString;
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    while (i2 <= paramString.length())
    {
      while ((i2 <= paramString.length()) && (dA.stringWidth(paramString.substring(i1, i2)) <= paramInt3)) {
        i2 = (short)(i2 + 1);
      }
      i2 = (short)(i2 - 1);
      if (paramInt4 <= i3)
      {
        if (paramInt5 == i3 - paramInt4) {
          return;
        }
        this.fj.drawString(paramString.substring(i1, i2), paramInt1, paramInt2 + (i3 - paramInt4) * eA, 20);
      }
      i3 = (byte)(i3 + 1);
      i2 = (short)(i2 + 1);
      i1 = i2;
    }
  }
  
  public String jdMethod_null(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    if (paramString.length() == 0) {
      return "";
    }
    String str = "";
    try
    {
      str = paramString.substring(4, paramString.indexOf(":") - 1);
    }
    catch (Exception localException)
    {
      str = "";
    }
    return str;
  }
  
  public boolean jdMethod_else(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if (paramString.length() == 0) {
      return false;
    }
    try
    {
      return paramString.substring(paramString.indexOf(":") - 1, paramString.indexOf(":")).equals("1");
    }
    catch (Exception localException) {}
    return false;
  }
  
  public byte jdMethod_if(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    if (paramString.length() == 0) {
      return -1;
    }
    int i1 = g.b6.length;
    String str = paramString.substring(1, 3);
    byte b10 = -1;
    for (int i2 = 0; i2 < i1; i2++) {
      if (str.equals(g.b6[i2]))
      {
        b10 = (byte)i2;
        break;
      }
    }
    return b10;
  }
  
  public boolean jdMethod_do(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if (paramString.length() == 0) {
      return false;
    }
    return (paramString.substring(1, 3).equals(g.b6[4])) || (paramString.substring(1, 3).equals(g.b6[3]));
  }
  
  public boolean g(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if (paramString.length() == 0) {
      return false;
    }
    return paramString.substring(1, 3).equals(g.b6[1]);
  }
  
  public boolean jdMethod_long(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    if (paramString.length() == 0) {
      return false;
    }
    return paramString.substring(1, 3).equals(g.b6[2]);
  }
  
  public void C()
  {
    if (!this.bu)
    {
      int i1 = 1 + (this.eC ? eA + 2 : 0);
      int i2 = dU - 82 + 20;
      int i3 = i2 + 30;
      int i4 = this.cR.length();
      int i5 = this.cJ.jdField_int / 10 % (i4 + 1);
      i3 -= eA * i5;
      if ((this.dT != 1) && (i5 < i4))
      {
        this.fj.setClip(i2, i1, 60, this.bO * 2);
        a(this.cR, i3, i1 + 1, 20, b2[0][0]);
        this.fj.setClip(0, 0, dU, fp);
      }
      this.fj.setColor(0);
      this.fj.drawRect(i2 + 1, i1 + 1, 60, this.bO * 2);
      this.fj.setColor(b2[5][0]);
      this.fj.drawRect(i2, i1, 60, this.bO * 2);
      if (this.cJ.jdField_int / 3 % 2 == 0) {
        this.fj.setColor(b2[3][1]);
      } else {
        this.fj.setColor(16777215);
      }
      this.fj.fillArc(i2 + 3 * (this.cZ.aP / u), i1 + 2 * (this.cZ.aM / u), 3, 3, 0, 360);
      this.fj.setColor(b2[4][0]);
      for (int i6 = 0; i6 < 4; i6++) {
        if (void[i6] != -1) {
          this.fj.fillRect(Math.min(i2 + 3 * (void[i6] % this.w), dU - 3), i1 + 2 * (void[i6] / this.w), 3, 3);
        }
      }
      if (this.cJ.mN != null)
      {
        this.fj.setColor(b2[5][0]);
        for (i6 = 0; i6 < this.cJ.mN.length; i6 = (byte)(i6 + 1)) {
          if ((this.cJ.mN[i6].jdField_int) && (this.cJ.mN[i6].jdField_try >= 0) && (this.cJ.mN[i6].jdField_new >= 0) && (this.cJ.mN[i6].jdField_try <= this.ad) && (this.cJ.mN[i6].jdField_new <= this.dz)) {
            this.fj.fillRect(i2 + 3 * (this.cJ.mN[i6].jdField_try / u), i1 + 2 * (this.cJ.mN[i6].jdField_new / u), 3, 3);
          }
        }
      }
      if (a9 == 0)
      {
        jdMethod_new(dU - 25, i1 + 1 + this.bO * 2 + 2);
        this.cJ.jdMethod_do(dU - 25, i1 + 1 + this.bO * 2 + 2 + 8);
      }
      else
      {
        jdMethod_new(dU / 2 - 13, i1);
        this.cJ.jdMethod_do(dU / 2 - 13, i1 + 10);
      }
    }
    f();
  }
  
  public void R()
  {
    int i1 = this.eC ? eA + 2 : 0;
    int i2 = 14 + i1;
    int i3 = 64;
    i3 -= String.valueOf(this.cZ.aM / b8).length() * 5;
    a(i3, i2, this.cZ.aM / b8, 20);
    i3 -= 5;
    a(i3, i2, 5, 5, 50, 0, this.aH[5], 0);
    i3 -= String.valueOf(this.cZ.aP / u).length() * 5;
    a(i3, i2, this.cZ.aP / u, 20);
    if (this.dT != 1) {
      a(20, 2 + i1, 20, 20, this.cZ.gD == 0 ? 20 : 0, 0, this.aH[7], 0);
    }
    int i4 = 24;
    a(40, 3 + i1, i4, 3, b2[4][0], this.cZ.a((byte)20), this.cZ.a((byte)16));
    if (this.de > 0) {
      a(40, 6 + i1, i4, 3, b2[8][1], this.cZ.a((byte)26), this.cZ.a((byte)24) + this.de);
    }
    a(40, 6 + i1, i4, 3, b2[3][0], this.cZ.a((byte)26), this.cZ.a((byte)24), this.de <= 0);
    int i5 = b2[0][0];
    a(40, 9 + i1, i4, 3, i5, ag.g2, a3.jdMethod_do(this.cZ.hh, a.t));
  }
  
  public void jdMethod_case(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      if (i1 > 0)
      {
        paramDataInputStream.readShort();
        if (this.bV == null) {
          this.bV = new x(this);
        }
        this.bV.a(paramDataInputStream, false);
        int i2 = paramDataInputStream.readShort();
        byte[] arrayOfByte = new byte[i2];
        paramDataInputStream.readFully(arrayOfByte);
        this.aH[1] = jdMethod_do(arrayOfByte);
        arrayOfByte = null;
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_do(DataInputStream paramDataInputStream)
  {
    try
    {
      ar.c8 = paramDataInputStream.readByte();
      if (ar.c8 <= 0) {
        return;
      }
      if (this.cl == null)
      {
        this.cl = new x[2];
        this.cl[0] = new x(this);
        this.cl[1] = new x(this);
      }
      ar.cV = new Image[ar.c8];
      ar.ce = new short[ar.c8];
      ar.cx = new String[ar.c8];
      ar.cL = new byte[ar.c8];
      ar.cA = new int[ar.c8];
      ar.co = new int[ar.c8];
      ar.b6 = new short[ar.c8];
      ar.cQ = new short[ar.c8];
      ar.b4 = new short[ar.c8];
      ar.cO = new short[ar.c8];
      ar.cu = new byte[ar.c8];
      ar.bU = new byte[ar.c8][2];
      ar.cs = new byte[ar.c8];
      ar.bS = new byte[ar.c8][2];
      ar.cr = new byte[ar.c8];
      ar.bQ = new byte[ar.c8][2];
      ar.cJ = new byte[ar.c8];
      ar.bW = new byte[ar.c8];
      ar.cN = new byte[ar.c8];
      ar.dl = new byte[ar.c8];
      ar.c7 = new byte[ar.c8];
      ar.c1 = new byte[ar.c8];
      ar.ct = new byte[ar.c8];
      ar.cq = new byte[ar.c8];
      ar.c4 = new byte[ar.c8];
      for (int i1 = 0; i1 < ar.c8; i1++)
      {
        paramDataInputStream.readShort();
        if (this.cl[i1] == null) {
          this.cl[i1] = new x(this);
        }
        this.cl[i1].a(paramDataInputStream, false);
        int i2 = paramDataInputStream.readShort();
        byte[] arrayOfByte = new byte[i2];
        paramDataInputStream.readFully(arrayOfByte);
        ar.cV[i1] = jdMethod_do(arrayOfByte);
        arrayOfByte = null;
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_try()
  {
    this.cJ.kT = 0;
    g.hm = new ag[30];
  }
  
  public void z()
  {
    for (int i1 = 0; i1 < this.cJ.kT; i1 = (byte)(i1 + 1)) {
      g.hm[i1] = null;
    }
    g.hm = null;
  }
  
  public void jdMethod_byte()
  {
    this.cJ.fu.clear();
    this.cJ.kT = 0;
    for (int i1 = 0; i1 < 30; i1++)
    {
      this.cJ.co[i1] = 0;
      this.cJ.iG[i1] = 0;
      this.cJ.k9[i1] = false;
      this.cJ.iy[i1] = "";
      this.cJ.mX[i1] = 0;
      this.cJ.mW[i1] = 0;
      this.cJ.eX[i1] = 0;
      this.cJ.kf[i1] = 0;
      this.cJ.gT[i1] = false;
      this.cJ.dq[i1] = 0;
      this.cJ.jC[i1] = null;
      this.cJ.jq[i1] = 0;
      this.cJ.jo[i1] = 0;
      this.cJ.mL[i1] = -1;
      this.cJ.gF[i1] = 0;
      this.cJ.gh[i1] = -1;
      this.cJ.fy[i1] = null;
      this.cJ.k7[i1] = -1;
    }
  }
  
  public void B()
  {
    this.b0.a(1, 0, this.cJ.de[0][3]);
    this.b0.a(1, 0, this.cJ.de[0][2]);
    this.b0.a(2, 0, this.cJ.de[0][0]);
    this.b0.a(2, 0, this.cJ.de[0][1]);
    this.b0.a(21, 0, this.cJ.de[0][5]);
    this.b0.a(20, 0, this.cJ.de[0][4]);
    this.cJ.de[0][4][3] = 38;
    this.b0.a(28, 0, this.cJ.de[1][3]);
    this.b0.a(28, 0, this.cJ.de[1][2]);
    this.b0.a(29, 0, this.cJ.de[1][0]);
    this.b0.a(29, 0, this.cJ.de[1][1]);
    this.b0.a(48, 0, this.cJ.de[1][5]);
    this.b0.a(47, 0, this.cJ.de[1][4]);
    this.cJ.de[1][4][3] = 118;
  }
  
  void c(String paramString)
  {
    if (this.aG.jdMethod_int(3003))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_do(1);
      this.aG.jdMethod_do(0);
      this.aG.jdMethod_if();
    }
  }
  
  void jdMethod_case(String paramString)
  {
    if (this.aG.jdMethod_int(3003))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_do(0);
      this.aG.jdMethod_do(0);
      this.aG.jdMethod_if();
    }
  }
  
  void f(String paramString)
  {
    if (this.aG.jdMethod_int(3003))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_do(1);
      this.aG.jdMethod_do(1);
      this.aG.jdMethod_if();
    }
  }
  
  void jdMethod_void(String paramString)
  {
    if (this.aG.jdMethod_int(3003))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_do(0);
      this.aG.jdMethod_do(1);
      this.aG.jdMethod_if();
    }
  }
  
  void jdMethod_int(String paramString)
  {
    if (this.aG.jdMethod_int(3501))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_if();
    }
  }
  
  void jdMethod_byte(String paramString)
  {
    if (this.aG.jdMethod_int(3561))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_if();
    }
  }
  
  void e(String paramString)
  {
    if (this.aG.jdMethod_int(3563))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_if();
    }
  }
  
  public void o()
  {
    this.cJ.jdField_if = this.M;
    this.cJ.a = this.bH;
    a(this.cJ, this.cJ);
  }
  
  public void a(l paraml)
  {
    if ((paraml.jdField_try < ag.hF + dU) && (paraml.jdField_try + this.aH[1].getWidth() > ag.hF) && (paraml.jdField_new < ag.hE + fp) && (paraml.jdField_new + this.aH[1].getHeight() > ag.hE) && (paraml.jdField_int))
    {
      this.bV.a(paraml.jdField_try - ag.hF, paraml.jdField_new - ag.hE, this.aH[1], paraml.a, 0);
      this.bV.a(paraml.a);
      if (this.dT != 1) {
        a(paraml.jdField_if, paraml.jdField_try - ag.hF, paraml.jdField_new - 25 - ag.hE, 20, b2[4][0]);
      }
    }
  }
  
  public void U()
  {
    this.F = true;
    this.bu = false;
    this.t = 2;
    this.dT = 0;
    this.cv = 0;
    this.eQ = 0;
    this.fI = false;
    this.b3 = 0;
    this.cr = true;
    this.bY = true;
    this.ef = 0;
    this.fs = 0;
    if ((cz) || (bL.equals("79"))) {
      this.j = true;
    } else {
      this.j = false;
    }
  }
  
  public void Q()
  {
    RecordStore localRecordStore = null;
    try
    {
      localRecordStore = RecordStore.openRecordStore("OPTION", true);
      byte[] arrayOfByte = localRecordStore.getRecord(1);
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
      this.ef = localDataInputStream.readByte();
      this.bu = localDataInputStream.readBoolean();
      this.F = localDataInputStream.readBoolean();
      this.t = localDataInputStream.readByte();
      this.dT = localDataInputStream.readByte();
      if (this.dT == 2) {
        aL = true;
      } else {
        aL = false;
      }
      this.cv = localDataInputStream.readByte();
      this.eQ = localDataInputStream.readByte();
      this.fI = localDataInputStream.readBoolean();
      dc = localDataInputStream.readBoolean();
      this.b3 = localDataInputStream.readByte();
      this.cr = localDataInputStream.readBoolean();
      this.bY = localDataInputStream.readBoolean();
      this.j = localDataInputStream.readBoolean();
      if (localDataInputStream.available() > 0)
      {
        this.fs = localDataInputStream.readByte();
      }
      else
      {
        this.fs = 0;
        jdMethod_else();
      }
      localDataInputStream.close();
      localByteArrayInputStream.close();
      arrayOfByte = null;
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
      U();
    }
  }
  
  public void jdMethod_else()
  {
    try
    {
      RecordStore localRecordStore = RecordStore.openRecordStore("OPTION", true);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeByte(this.ef);
      localDataOutputStream.writeBoolean(this.bu);
      localDataOutputStream.writeBoolean(this.F);
      localDataOutputStream.writeByte(this.t);
      localDataOutputStream.writeByte(this.dT);
      localDataOutputStream.writeByte(this.cv);
      localDataOutputStream.writeByte(this.eQ);
      localDataOutputStream.writeBoolean(this.fI);
      localDataOutputStream.writeBoolean(dc);
      localDataOutputStream.writeByte(this.b3);
      localDataOutputStream.writeBoolean(this.cr);
      localDataOutputStream.writeBoolean(this.bY);
      localDataOutputStream.writeBoolean(this.j);
      localDataOutputStream.writeByte(this.fs);
      localDataOutputStream.close();
      localByteArrayOutputStream.close();
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      if (localRecordStore.getNumRecords() == 0) {
        localRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } else {
        localRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
      }
      if (localRecordStore != null)
      {
        localRecordStore.closeRecordStore();
        localRecordStore = null;
      }
    }
    catch (Exception localException) {}
  }
  
  //初始化存档 清空删除
  public void T()
  {
    try
    {
      this.e4 = new int[0][4];
      //删除本地存档
      RecordStore.deleteRecordStore("RESLIST1");
      RecordStore.deleteRecordStore("RES1");
    }
    catch (Exception localException) {}
  }
  

  //读取存档 设置相关常量值
  //这里会删除存档
  public void G()
  {
    RecordStore localRecordStore = null;
    try
    {
      //打开数据库（存档） 
      localRecordStore = RecordStore.openRecordStore("RESLIST1", false);
      //读取第一条
      byte[] arrayOfByte = localRecordStore.getRecord(1);
      //创建一个数据流缓冲区  长度为arrayOfByte
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      //读取数据流
      DataInputStream localDataInputStream = new DataInputStream(localByteArrayInputStream);
      //提取1个字节
      long l1 = localDataInputStream.readByte();
      //如果不等于0就关闭数据库存档 和清除缓冲区 删除存档
      if (l1 != 0L)
      {
        //清除缓冲区 
        localDataInputStream.close();
        localByteArrayInputStream.close();
        localRecordStore.closeRecordStore();    //关闭数据库存档 
        //删除存档
        T();  
        return;
      }
      //读取两个字节  存档数量
      int i1 = localDataInputStream.readShort();
      //创建一个i1*4的数组
      this.e4 = new int[i1][4];

      //读取有关存档的信息 4字节为一组 int类型
      //用读入的两个字节长度做计次循环
      for (int i2 = 0; i2 < i1; i2 = (short)(i2 + 1)) {
        //读取每个数组的二维长度做计次循环
        for (int i3 = 0; i3 < this.e4[i2].length; i3 = (byte)(i3 + 1))
        {
          //处理存档信息返回到类中使用  取4字节进行处理
          //在010中查询到的数值异常大 是因为最高位是8溢出了返回的是附属
          this.e4[i2][i3] = a3.jdMethod_do(localDataInputStream.readInt(), 4);

          //只要其中一条存档数据是空的就要删除存档
          if (this.e4[i2][i3] == 0)
          {
            T();
            return;
          }
        }
      }
      localDataInputStream.close();
      localByteArrayInputStream.close();
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
      T();
    }
  }
  
  //写出存档
  public void l()
  {
    RecordStore localRecordStore = null;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      localDataOutputStream.writeByte(0);
      localDataOutputStream.writeShort(this.e4.length);
      for (int i1 = 0; i1 < this.e4.length; i1 = (short)(i1 + 1)) {
        for (int i2 = 0; i2 < this.e4[i1].length; i2 = (byte)(i2 + 1)) {
          localDataOutputStream.writeInt(a3.jdMethod_new(this.e4[i1][i2], 4));
        }
      }
      localDataOutputStream.close();
      localByteArrayOutputStream.close();
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localRecordStore = RecordStore.openRecordStore("RESLIST1", true);
      if (localRecordStore.getNumRecords() == 0) {
        localRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
      } else {
        localRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
      a(localException);
    }
  }
  
  // 存档值处理函数 更新存档
  // 只要有其他函数调用了此数据 就说明会有网络数据流入本地本地 进行更新
  // 接下来我要找到有调用此函数的地方
  public void a(short paramShort1, short paramShort2, short paramShort3, int paramInt)
  {
    int i1 = 0;

    // 遍历存档 如果第2组数据符合参数2 就修改其余三组数据
    // 也就是说第2组数据可以控制其余三组的值
    // 如果插入的是新的值就继续走

    for (int i2 = 0; i2 < this.e4.length; i2++) {
      if (this.e4[i2][1] == paramShort2)
      {
        this.e4[i2][0] = paramShort1;
        this.e4[i2][2] = paramShort3;
        this.e4[i2][3] = paramInt;
        i1 = 1;
      }
    }
    // 如果不符合没有更新其余三组数据
    // 就说明是新的值 有新的存档数据进入
    // 创建一个新的数组来追加新的存档数据
    if (i1 == 0)
    {

      int[][] arrayOfInt = new int[this.e4.length + 1][4];
      for (int i3 = 0; i3 < this.e4.length; i3 = (byte)(i3 + 1)) {
        for (int i4 = 0; i4 < this.e4[i3].length; i4 = (byte)(i4 + 1)) {
          arrayOfInt[i3][i4] = this.e4[i3][i4];
        }
      }
      // 追加新的数组
      arrayOfInt[(arrayOfInt.length - 1)][0] = paramShort1;
      arrayOfInt[(arrayOfInt.length - 1)][1] = paramShort2;
      arrayOfInt[(arrayOfInt.length - 1)][2] = paramShort3;
      arrayOfInt[(arrayOfInt.length - 1)][3] = paramInt;
      //更新源存档数据变量
      this.e4 = arrayOfInt;
    }
    //在写出本地文件
    l();
  }
  
  public short jdMethod_else(short paramShort)
  {
    for (int i1 = 0; i1 < this.e4.length; i1++) {
      if (this.e4[i1][1] == paramShort) {
        return (short)this.e4[i1][0];
      }
    }
    return -1;
  }
  
  public short A(short paramShort)
  {
    for (int i1 = 0; i1 < this.e4.length; i1++) {
      if (this.e4[i1][1] == paramShort) {
        return (short)this.e4[i1][2];
      }
    }
    return -1;
  }
  
  public int P(short paramShort)
  {
    for (int i1 = 0; i1 < this.e4.length; i1++) {
      if (this.e4[i1][1] == paramShort) {
        return this.e4[i1][3];
      }
    }
    return -1;
  }
  
  //过图存档相关
  //写出存档
  //可以找有谁调用了此方法
  //参数1 二进制流数据
  //参数2 控制添加和设置存档
  public short a(byte[] paramArrayOfByte, int paramInt)
  {
    RecordStore localRecordStore = null;
    try
    {
      //打开存档
      localRecordStore = RecordStore.openRecordStore("RES1", true);
      int i1 = 0;
      if (paramInt <= 0)
      {
        //添加数据
        i1 = localRecordStore.addRecord(paramArrayOfByte, 0, paramArrayOfByte.length);
      }
      else
      {
        localRecordStore.setRecord(paramInt, paramArrayOfByte, 0, paramArrayOfByte.length);
        i1 = paramInt;
      }
      //关闭文件
      localRecordStore.closeRecordStore();
      return (short)i1;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  //读取地图存档 并返回
  public byte[] i(short paramShort)
  {
    RecordStore localRecordStore = null;
    try
    {
      //读取存档
      localRecordStore = RecordStore.openRecordStore("RES1", true);
      //读取那段?那个文件？
      byte[] arrayOfByte = localRecordStore.getRecord(paramShort);
      //关闭文件
      localRecordStore.closeRecordStore();
      //返回数据
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return null;
  }
  
  
  public void P()
  {
    eu = 0;
    if (et == null)
    {
      et = new short[15];
      er = new byte[15];
      ep = new short[15];
      eo = new short[15];
      en = new byte[15];
    }
  }
  
  public void a(short paramShort1, short paramShort2, short paramShort3, byte paramByte)
  {
    if (paramShort1 == 9999) {
      return;
    }
    if (eu < 15)
    {
      et[eu] = paramShort1;
      ep[eu] = paramShort2;
      eo[eu] = paramShort3;
      er[eu] = 6;
      en[eu] = paramByte;
      eu = (byte)(eu + 1);
    }
  }
  
  public void a()
  {
    for (int i1 = 0; i1 < eu; i1 = (byte)(i1 + 1))
    {
      if (et[i1] == 9999) {
        return;
      }
      int tmp25_24 = i1;
      short[] tmp25_21 = eo;
      tmp25_21[tmp25_24] = ((short)(tmp25_21[tmp25_24] - er[i1]));
      int tmp39_38 = i1;
      byte[] tmp39_35 = er;
      tmp39_35[tmp39_38] = ((byte)(tmp39_35[tmp39_38] - 1));
      if (er[i1] < 0)
      {
        et[i1] = et[(eu - 1)];
        ep[i1] = ep[(eu - 1)];
        eo[i1] = eo[(eu - 1)];
        er[i1] = er[(eu - 1)];
        en[i1] = en[(eu - 1)];
        et[(eu - 1)] = 0;
        ep[(eu - 1)] = 0;
        eo[(eu - 1)] = 0;
        er[(eu - 1)] = 0;
        en[(eu - 1)] = 0;
        eu = (byte)(eu - 1);
      }
      else
      {
        String str = null;
        if (et[i1] == 9998) {
          str = "Miss";
        } else {
          str = String.valueOf((et[i1] > 0 ? "+" : "") + et[i1]);
        }
        this.fj.setColor(0);
        this.fj.drawString(str, ep[i1] - ag.hF + 1, eo[i1] - ag.hE + 1, 20);
        switch (en[i1])
        {
        case 0: 
          this.fj.setColor(16711680);
          break;
        case 1: 
          this.fj.setColor(65280);
          break;
        case 2: 
          this.fj.setColor(255);
          break;
        case 3: 
          this.fj.setColor(16711935);
        }
        this.fj.drawString(str, ep[i1] - ag.hF, eo[i1] - ag.hE, 20);
      }
    }
  }
  
  public void a(short paramShort, int paramInt1, int paramInt2, Image paramImage, byte paramByte1, byte paramByte2)
  {
    if (paramShort < 0)
    {
      a(paramInt1, paramInt2, paramByte1, paramByte2, 15 * paramByte1, 0, paramImage, 0);
      paramInt1 += paramByte1;
      paramShort = (short)-paramShort;
    }
    int i1 = paramShort;
    for (int i2 = 1; (i1 = (short)(i1 / 10)) > 0; i2 = (byte)(i2 + 1)) {}
    for (byte b10 = (byte)(i2 - 1); b10 >= 0; b10 = (byte)(b10 - 1))
    {
      a(paramInt1 + b10 * paramByte1, paramInt2, paramByte1, paramByte2, paramShort % 10 * paramByte1, 0, paramImage, 0);
      paramShort = (short)(paramShort / 10);
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (paramInt1 + paramInt3 >= paramInt5) && (paramInt1 <= paramInt5 + paramInt7) && (paramInt2 + paramInt4 >= paramInt6) && (paramInt2 <= paramInt6 + paramInt8);
  }
  
  public static int jdMethod_if(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return jdMethod_int((paramInt1 - paramInt2) * (paramInt1 - paramInt2) + (paramInt3 - paramInt4) * (paramInt3 - paramInt4));
  }
  
  public static int a(a3 parama31, a3 parama32)
  {
    int i1 = parama31.aP + parama31.aK / 2;
    int i2 = parama31.aM + parama31.bA;
    int i3 = parama32.aP + parama32.aK / 2;
    int i4 = parama32.aM + parama32.bA;
    return jdMethod_int((i1 - i3) * (i1 - i3) + (i2 - i4) * (i2 - i4));
  }
  
  public void q()
  {
    if ((this.cZ.gV != null) || (this.cZ.ep != null))
    {
      int i1 = (short)(dU - 40);
      int i2 = (short)(fp / 5);
      int i3 = 1;
      short s1 = 0;
      if (this.cZ.gV != null) {
        s1 = this.cZ.gV.bg;
      } else {
        s1 = this.cZ.ep.bg;
      }
      if (this.dE != s1) {
        this.bT = 0;
      }
      this.dE = s1;
      short s2 = s1;
      while ((s2 = (short)(s2 / 10)) > 0) {
        i3 = (byte)(i3 + 1);
      }
      a(s1, i1 - 20 * i3, i2 + (this.bT == 0 ? 2 : 0), this.aH[11], (byte)20, (byte)10);
      a(i1, i2, 35, 10, 220, 0, this.aH[11], 0);
      this.bT = ((short)(this.bT + 1));
    }
  }
  
  public void jdMethod_for(int paramInt1, int paramInt2)
  {
    eT = (short)((dU / u + 2) * u);
    eS = (short)((fp / b8 + 2) * b8);
    switch (paramInt1)
    {
    case 0: 
      h = new short[(dU / u + 2) * (fp / b8 + 4)];
      break;
    case 1: 
      this.d4 = Image.createImage(eT, eS);
      this.ei = this.d4.getGraphics();
    }
  }
  
  public void jdMethod_else(DataInputStream paramDataInputStream)
  {
    if (paramDataInputStream == null) {
      return;
    }
    try
    {
      paramDataInputStream.readShort();
      this.cR = paramDataInputStream.readUTF();
      g.dD = paramDataInputStream.readByte();
      g.dZ = paramDataInputStream.readByte();
      this.fi = paramDataInputStream.readShort();
      this.cJ.jB = paramDataInputStream.readShort();
      for (int i1 = 0; i1 < 4; i1++)
      {
        void[i1] = paramDataInputStream.readShort();
        al[i1] = paramDataInputStream.readShort();
        ga[i1] = paramDataInputStream.readUTF();
      }
      if ((this.d5) || (this.cJ.jdField_if == 3))
      {
        this.M = this.cJ.jdField_if;
        this.bH = this.fi;
        this.aF = this.cR;
        if ((g.dD == 2) && (g.dZ == 1))
        {
          this.M = this.eb;
          this.bH = 0;
          this.aF = "";
        }
      }
      this.fU = paramDataInputStream.readShort();
      this.bO = paramDataInputStream.readByte();
      this.w = paramDataInputStream.readByte();
      this.dz = ((short)(this.bO * b8));
      this.ad = ((short)(this.w * u));
      this.cN = paramDataInputStream.readByte();
      this.fJ = new short[this.bO * this.w];
      i1 = 0;
      this.cT = 0;
      int i2 = 2;
      int i3 = 5;
      int i4 = 20;
      if (((this.cJ.jdField_if >= 6) && (this.cJ.jdField_if <= 13)) || (this.cJ.jdField_if == 55) || (this.cJ.jdField_if == 410) || (this.cJ.jdField_if == 411))
      {
        i5 = 30;
        if (this.cJ.jdField_if == 411)
        {
          i5 = 90;
          i3 = 5;
          i4 = 10;
        }
        else if (this.cJ.jdField_if == 410)
        {
          i2 = 37;
          i5 = 50;
          i3 = 5;
          i4 = 15;
        }
        i1 = 1;
        this.aN = new short[i5];
        this.aK = new short[i5];
        this.c8 = new byte[i5];
      }
      for (int i5 = 0; i5 < this.bO * this.w; i5++)
      {
        this.fJ[i5] = paramDataInputStream.readShort();
        if ((i1 != 0) && (this.cT < this.aN.length) && ((this.fJ[i5] & 0x3FF) == i2))
        {
          int i6 = 0;
          int i7 = (byte)jdMethod_if(1, 100);
          if (i7 < i3) {
            i6 = 2;
          } else if (i7 < i4) {
            i6 = 1;
          } else {
            i6 = 0;
          }
          for (int i8 = 0; i8 < i6; i8 = (byte)(i8 + 1)) {
            jdMethod_do(i5 % this.w * u, i5 / this.w * u, u, b8);
          }
        }
      }
    }
    catch (Exception localException) {}
  }
  
  private void jdMethod_do(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // 碰到某个东西就返回 可能是验证之类 验证长度？ 验证crc正确性？
    if (this.cT >= this.aN.length) {
      return;
    }
    // -2147483646 + 1，-2147483646+0-1
    //可能是 概率常量
    this.aN[this.cT] = ((short)jdMethod_if(paramInt1 + 1, paramInt1 + paramInt3 - 1));
    this.aK[this.cT] = ((short)jdMethod_if(paramInt2 + 1, paramInt2 + paramInt4 - 1));
    // private static final int[] p = { 4144959, 8355711, 15724527 };
    //某个静态变量的长度影响了一个数值
    this.c8[this.cT] = ((byte)jdMethod_if(0, p.length - 1));
    this.cT = ((short)(this.cT + 1));
  }
  
  public void jdMethod_if(Image paramImage)
  {
    a(paramImage);
    a(ag.hF, ag.hE, dU, fp, this.cJ.jdField_int);
  }
  
  public void a(short paramShort1, short paramShort2, Image paramImage)
  {
    if ((paramShort2 & 0x3FF) != 0)
    {
      int i1 = 0;
      int i2 = 0;
      int i3 = (paramShort2 & 0x200) >> 9;
      if (i3 == 0)
      {
        i2 = paramShort2 & 0x1FF;
        i1 = 0;
      }
      else
      {
        i2 = paramShort2 & 0x3F;
        i1 = jdMethod_for((paramShort2 & 0x1C0) >> 6);
      }
      a(paramShort1 % this.w * u - ag.hF, paramShort1 / this.w * b8 - ag.hE, u, b8, (i2 - 1) * u, 0, paramImage, i1);
    }
  }
  
  public void N() {}
  
  private int jdMethod_int(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.w) || (paramInt2 < 0) || (paramInt2 >= this.bO)) {
      return -1;
    }
    return paramInt2 * this.w + paramInt1;
  }
  
  private void a(Image paramImage, int paramInt1, int paramInt2, short paramShort)
  {
    int i1 = 0;
    int i2 = 0;
    if ((this.fJ[paramShort] & 0x3FF) != 0)
    {
      int i3 = (this.fJ[paramShort] & 0x200) >> 9;
      if (i3 == 0)
      {
        i2 = this.fJ[paramShort] & 0x1FF;
        i1 = 0;
      }
      else
      {
        i2 = this.fJ[paramShort] & 0x3F;
        i1 = jdMethod_for((this.fJ[paramShort] & 0x1C0) >> 6);
      }
      a(this.ei, paramInt1, paramInt2, u, b8, (i2 - 1) * u, 0, paramImage, i1);
    }
  }
  
  private int jdMethod_for(int paramInt)
  {
    if (paramInt == 7) {
      return 4;
    }
    if (paramInt == 4) {
      return paramInt | 0x3;
    }
    return paramInt;
  }
  
  //游戏素材动画操作
  private void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i2 = paramInt2 * b8 % eS;
    for (int i4 = paramInt2; i4 <= paramInt4; i4++)
    {
      int i1 = paramInt1 * u % eT;
      for (int i3 = paramInt1; i3 <= paramInt3; i3++)
      {
        //切图
        this.ei.setClip(i1, i2, u, b8);
        short s1 = (short)jdMethod_int(i3, i4);
        if (s1 != -1) {
          a(paramImage, i1, i2, s1);
        }
        i1 += u;
        if (i1 >= eT) {
          i1 -= eT;
        }
      }
      i2 += b8;
      if (i2 >= eS) {
        i2 -= eS;
      }
    }
  }
  
  //绘制图形到屏幕
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.fj.setClip(paramInt5, paramInt6, paramInt3, paramInt4);
    this.fj.drawImage(this.d4, paramInt5 - paramInt1, paramInt6 - paramInt2, 20);
  }
  
  public void a(Image paramImage)
  {
    int i1 = ag.hF / u;
    int i3 = i1 + dU / u + 1;
    int i2 = ag.hE / b8;
    int i4 = i2 + fp / b8 + 1;
    if (f1)
    {
      f1 = false;
      if ((this.ad <= eT) || (this.dz <= eS))
      {
        this.d4 = Image.createImage(eT, eS);
        this.ei = this.d4.getGraphics();
        this.ei.setColor(0);
        this.ei.fillRect(0, 0, eT, eS);
        a(paramImage, i1, i2, i3, i4);
        this.d0 = i1;
        this.dY = i2;
        this.dZ = i3;
        this.dX = i4;
      }
      a(paramImage, i1, i2, i3, i4);
      this.d0 = i1;
      this.dY = i2;
      this.dZ = i3;
      this.dX = i4;
    }
    else if (this.d1)
    {
      this.d1 = false;
      a(paramImage, i1, i2, i3, i4);
      this.d0 = i1;
      this.dY = i2;
      this.dZ = i3;
      this.dX = i4;
    }
    int i5;
    int i6;
    if (this.d0 != i1)
    {
      if (this.d0 < i1)
      {
        i5 = this.dZ + 1;
        i6 = i3;
      }
      else
      {
        i5 = i1;
        i6 = this.d0 - 1;
      }
      a(paramImage, i5, i2, i6, i4);
      this.d0 = i1;
      this.dZ = i3;
    }
    if (this.dY != i2)
    {
      if (this.dY < i2)
      {
        i5 = this.dX + 1;
        i6 = i4;
      }
      else
      {
        i5 = i2;
        i6 = this.dY - 1;
      }
      a(paramImage, i1, i5, i3, i6);
      this.dY = i2;
      this.dX = i4;
    }
    int i7 = ag.hF % eT;
    int i9 = ag.hE % eS;
    int i8 = (ag.hF + dU) % eT;
    int i10 = (ag.hE + fp) % eS;
    if (i8 > i7)
    {
      if (i10 > i9)
      {
        a(i7, i9, dU, fp, 0, 0);
      }
      else
      {
        a(i7, i9, dU, fp - i10, 0, 0);
        a(i7, 0, dU, i10, 0, 0 + fp - i10);
      }
    }
    else if (i10 > i9)
    {
      a(i7, i9, dU - i8, fp, 0, 0);
      a(0, i9, i8, fp, dU - i8, 0);
    }
    else
    {
      a(i7, i9, dU - i8, fp - i10, 0, 0);
      a(i7, 0, dU - i8, i10, 0, 0 + fp - i10);
      a(0, i9, i8, fp - i10, dU - i8, 0);
      a(0, 0, i8, i10, dU - i8, 0 + fp - i10);
    }
    this.fj.setClip(0, 0, dU, fp);
  }
  
  public void jdMethod_if(int paramInt1, int paramInt2, byte paramByte)
  {
    int i1 = 15;
    int i2 = 15;
    int i3 = u(paramByte) * i1;
    int i4 = 0;
    a(paramInt1, paramInt2, i1, i2, 4 * i1, 0, this.fz, 0);
    a(paramInt1, paramInt2, i1, i2, i3, i4, this.fz, 0);
  }
  
  public String[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    if (paramArrayOfByte.length == 0) {
      return null;
    }
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(Q);
    arrayOfString = new String[paramArrayOfByte.length];
    try
    {
      for (int i1 = 0; i1 < paramArrayOfByte.length; i1++)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        if (i1 == 0) {
          localByteArrayInputStream.skip(paramArrayOfByte[i1] * 10);
        } else {
          localByteArrayInputStream.skip((paramArrayOfByte[i1] - paramArrayOfByte[(i1 - 1)] - 1) * 10);
        }
        for (int i2 = 0; i2 < 5; i2++) {
          localStringBuffer.append((char)(localByteArrayInputStream.read() | localByteArrayInputStream.read() << 8));
        }
        arrayOfString[i1] = localStringBuffer.toString().trim();
        if (ag.l(paramArrayOfByte[i1])) {
          arrayOfString[i1] = ("[职]" + arrayOfString[i1]);
        }
      }
      return arrayOfString;
    }
    catch (Exception localException2) {}finally
    {
      try
      {
        localByteArrayInputStream.close();
        localByteArrayInputStream = null;
      }
      catch (Exception localException4) {}
    }
  }
  
  public static byte s(byte paramByte)
  {
    return (byte)(paramByte / a.c);
  }
  
  public static int jdMethod_try(byte paramByte)
  {
    return s(paramByte) * a.O + paramByte % a.c + (paramByte % a.c > (byte)a.i ? (byte)a.t : (byte)a.ac) + (paramByte % a.c > a.e ? (byte)a.t : (byte)a.ac);
  }
  
  public static long j(byte paramByte)
  {
    if (ag.l(paramByte)) {
      return d3[jdMethod_try(paramByte)] & 0xF;
    }
    return ((d3[jdMethod_try(paramByte)] & 0xF) + a.char) * a.n + s(paramByte) * a.s;
  }
  
  public static byte y(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 6 & 0x3);
  }
  
  public static long t(byte paramByte)
  {
    int i1 = (int)(d3[jdMethod_try(paramByte)] >> a.C & 0x3);
    int i2 = a.ac;
    if (i1 > a.ac)
    {
      i1 = a.C + i1 * a.i;
      i2 = a.o + s(paramByte) * a.n * i1 + a.e * i1;
    }
    return i2;
  }
  
  public static long a(byte paramByte)
  {
    int i1 = (int)(d3[jdMethod_try(paramByte)] >> a.ad & 0xF);
    int i2 = a.ac;
    if (i1 > a.ac)
    {
      i1 = a.C + i1 * a.i;
      i2 = a.o + s(paramByte) * a.n * i1 + a.e * i1;
    }
    return i2;
  }
  
  public static long r(byte paramByte)
  {
    int i1 = (int)(d3[jdMethod_try(paramByte)] >> a.c & 0xF);
    int i2 = a.ac;
    if (i1 > a.ac)
    {
      i1 = a.C + i1 * a.i;
      i2 = a.o + s(paramByte) * a.n * i1 + a.e * i1;
    }
    return i2;
  }
  
  public static long w(byte paramByte)
  {
    int i1 = (int)(d3[jdMethod_try(paramByte)] >> a.long & 0xF);
    int i2 = a.ac;
    if (i1 > a.ac)
    {
      i1 = a.C + i1 * a.i;
      i2 = a.o + s(paramByte) * a.n * i1 + a.e * i1;
    }
    return i2;
  }
  
  public static int b(byte paramByte)
  {
    int i1 = (short)a.ac;
    int i2 = (short)(int)(d3[jdMethod_try(paramByte)] >> a.o & 0xF);
    if (i2 == a.ac) {
      i1 = (short)a.ac;
    } else if (ag.l(paramByte)) {
      i1 = (short)(i2 * a.F + s(paramByte) * a.char);
    } else {
      i1 = (short)(i2 * a.o + s(paramByte) * a.aa);
    }
    if (i2 > a.null) {
      i1 = (short)(i1 * a.i / a.t);
    }
    return a3.jdMethod_new(i1, a.C);
  }
  
  //读取技能消耗  参数应该是技能代码
  public static short jdMethod_null(byte paramByte)
  {
    //可能是获取技能类型?
    long l1 = (d3[jdMethod_try(paramByte)] >> a.g & 0xF) + a.char;
    //获取消耗的魔法值?
    //l1*常量5+（paramByte/12）
    int i1 = (short)(int)(l1 * a.J + s(paramByte) * a.n);
    //如果大于常量10 就乘以常量2
    //也就是说大于10魔法消耗会加倍
    //应该是判断技能类型
    if (l1 > a.n) {
      i1 = (short)(i1 * a.t);
    }
    //返回魔法值
    return i1;
  }
  
  public static byte u(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 28 & 0x3);
  }
  
  public static byte n(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 30 & 1L);
  }
  
  public static byte jdMethod_char(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 31 & 1L);
  }
  
  public static byte jdMethod_byte(byte paramByte)
  {
    int i1 = (byte)(int)(d3[jdMethod_try(paramByte)] >> 32 & 0x7);
    if (i1 == a.e) {
      i1 = (byte)a.n;
    }
    return i1;
  }
  
  public static byte v(byte paramByte)
  {
    return (byte)(int)(((d3[jdMethod_try(paramByte)] >> a.case & 0x7) + a.i) * a.n);
  }
  
  public static boolean i(byte paramByte)
  {
    return (d3[jdMethod_try(paramByte)] >> 38 & 1L) != 0L;
  }
  
  public static byte jdMethod_case(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 39 & 0x3);
  }
  
  public static byte m(byte paramByte)
  {
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 41 & 1L);
  }
  
  public static boolean k(byte paramByte)
  {
    return (d3[jdMethod_try(paramByte)] >> 42 & 1L) == a.ac;
  }
  
  public static byte jdMethod_int(byte paramByte)
  {
    if (u(paramByte) == a.i) {
      return -1;
    }
    return (byte)(int)(3L + (d3[jdMethod_try(paramByte)] >> 43 & 0xF));
  }
  
  public static byte jdMethod_else(byte paramByte)
  {
    if ((ag.l(paramByte)) && (j(paramByte) > 0L)) {
      return (byte)(int)-j(paramByte);
    }
    if (u(paramByte) == 3) {
      return 99;
    }
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 47 & 0xF);
  }
  
  public static byte o(byte paramByte)
  {
    if (u(paramByte) == a.i) {
      return -1;
    }
    return (byte)(int)(d3[jdMethod_try(paramByte)] >> 51 & 0x7);
  }
  
  public static byte jdMethod_long(byte paramByte)
  {
    if (u(paramByte) == a.i) {
      return -1;
    }
    return (byte)(int)((d3[jdMethod_try(paramByte)] >> 54 & 0x3) + a.char);
  }
  
  public static byte[] jdMethod_goto(byte paramByte)
  {
    if (u(paramByte) == a.i) {
      return null;
    }
    byte[] arrayOfByte = new byte[a.t];
    for (int i1 = 0; i1 < a.t; i1 = (byte)(i1 + 1)) {
      arrayOfByte[i1] = ((byte)(int)(a.n * ((d3[jdMethod_try(paramByte)] >> a.for + i1 * a.C & 0xF) - a.J)));
    }
    return arrayOfByte;
  }
  
  public static byte jdMethod_for(byte paramByte)
  {
    if (u(paramByte) != a.i) {
      return -1;
    }
    if (paramByte == ag.hI) {
      return (byte)a.ac;
    }
    return (byte)(int)(a.J + (d3[jdMethod_try(paramByte)] >> a.int & 0x1F));
  }
  
  public static byte[] h(byte paramByte)
  {
    if (u(paramByte) != a.i) {
      return null;
    }
    if (paramByte == ag.hI) {
      return new byte[] { 25 };
    }
    byte[] arrayOfByte = new byte[jdMethod_for(paramByte)];
    for (int i1 = 0; i1 < arrayOfByte.length; i1 = (byte)(i1 + 1))
    {
      if (i1 < a.C) {
        arrayOfByte[i1] = ((byte)(int)(d3[jdMethod_try(paramByte)] >> 48 + (i1 << 2) & 0xF));
      } else if (i1 < a.o) {
        arrayOfByte[i1] = ((byte)(int)(d3[(jdMethod_try(paramByte) + 1)] >> (i1 - a.C << 2) & 0xF));
      } else {
        arrayOfByte[i1] = ((byte)(int)(d3[(jdMethod_try(paramByte) + 2)] >> (i1 - a.o << 2) & 0xF));
      }
      int tmp143_142 = i1;
      byte[] tmp143_141 = arrayOfByte;
      tmp143_141[tmp143_142] = ((byte)(tmp143_141[tmp143_142] + a.i));
    }
    return arrayOfByte;
  }
  
  public static String jdMethod_void(byte paramByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = (int)(d3[jdMethod_try(paramByte)] >> 4 & 0x3);
    int i2 = (int)(d3[jdMethod_try(paramByte)] >> 8 & 0xF);
    int i3 = (int)(d3[jdMethod_try(paramByte)] >> 12 & 0xF);
    int i4 = (int)(d3[jdMethod_try(paramByte)] >> 16 & 0xF);
    if ((i1 > 0) && (i2 > 0) && (i3 > 0) && (i4 > 0))
    {
      localStringBuffer.append("高敏捷");
    }
    else
    {
      if (i1 > 1) {
        localStringBuffer.append(t(paramByte) + "物攻 ");
      }
      if (i3 > 1) {
        localStringBuffer.append(r(paramByte) + "魔攻 ");
      }
      if (i2 > 1) {
        localStringBuffer.append(a(paramByte) + "物防 ");
      }
      if (i4 > 1) {
        localStringBuffer.append(w(paramByte) + "魔防 ");
      }
    }
    return localStringBuffer.toString();
  }
  
  public static byte k(short paramShort)
  {
    if (paramShort < 0) {
      return -1;
    }
    if ((paramShort < 3840) || (paramShort >= 21000) || ((paramShort >= 5000) && (paramShort < 5100))) {
      return 0;
    }
    return 1;
  }
  
  public byte jdMethod_try(short paramShort)
  {
    if ((paramShort >= 10100) && (paramShort < '❴' + 20)) {
      return 90;
    }
    if ((paramShort >= 10000) && (paramShort < 10003)) {
      return 7;
    }
    if ((paramShort >= 10200) && (paramShort < '⟘' + 10)) {
      return 91;
    }
    if ((paramShort >= 5100) && (paramShort < 5612)) {
      return 9;
    }
    if (k(paramShort) != 1) {
      return -1;
    }
    if ((paramShort >= 20000) && (paramShort < 20512)) {
      return 6;
    }
    return if[(paramShort - 3840)];
  }
  
  public String U(short paramShort)
  {
    if ((paramShort - 10000 < 0) || (R == null)) {
      return "";
    }
    return R[(paramShort - 10000)];
  }
  
  public String w(short paramShort)
  {
    if ((paramShort - 10100 < 0) || (by == null)) {
      return "";
    }
    return by[(paramShort - 10100)];
  }
  
  public String R(short paramShort)
  {
    if ((paramShort - 10200 < 0) || (bc == null)) {
      return "";
    }
    return bc[(paramShort - 10200)];
  }
  
  public String[] a(short[] paramArrayOfShort, boolean paramBoolean)
  {
    arrayOfString = new String[paramArrayOfShort.length];
    int i1 = 0;
    short[] arrayOfShort = new short[paramArrayOfShort.length];
    for (int i2 = 0; i2 < paramArrayOfShort.length; i2 = (short)(i2 + 1))
    {
      arrayOfString[i2] = (this.i.a(paramArrayOfShort[i2]) + "\001");
      if (k(paramArrayOfShort[i2]) == 0)
      {
        int tmp79_77 = i2;
        String[] tmp79_76 = arrayOfString;
        tmp79_76[tmp79_77] = (tmp79_76[tmp79_77] + a(paramArrayOfShort[i2], paramBoolean));
      }
      else if (jdMethod_try(paramArrayOfShort[i2]) == 91)
      {
        if (fk == null)
        {
          int tmp136_134 = i2;
          String[] tmp136_133 = arrayOfString;
          tmp136_133[tmp136_134] = (tmp136_133[tmp136_134] + "");
        }
        else
        {
          arrayOfString[i2] = fk[(paramArrayOfShort[i2] - 10200)];
        }
      }
      else if (jdMethod_try(paramArrayOfShort[i2]) == 90)
      {
        if (aY == null)
        {
          int tmp205_203 = i2;
          String[] tmp205_202 = arrayOfString;
          tmp205_202[tmp205_203] = (tmp205_202[tmp205_203] + "");
        }
        else
        {
          int tmp232_230 = i2;
          String[] tmp232_229 = arrayOfString;
          tmp232_229[tmp232_230] = (tmp232_229[tmp232_230] + aY[(paramArrayOfShort[i2] - 10100)]);
        }
      }
      else if (jdMethod_try(paramArrayOfShort[i2]) == 7)
      {
        if (fq == null)
        {
          int tmp288_286 = i2;
          String[] tmp288_285 = arrayOfString;
          tmp288_285[tmp288_286] = (tmp288_285[tmp288_286] + "");
        }
        else
        {
          int tmp315_313 = i2;
          String[] tmp315_312 = arrayOfString;
          tmp315_312[tmp315_313] = (tmp315_312[tmp315_313] + fq[(paramArrayOfShort[i2] - 10000)]);
        }
      }
      else if (jdMethod_try(paramArrayOfShort[i2]) == 6)
      {
        int tmp365_363 = i2;
        String[] tmp365_362 = arrayOfString;
        tmp365_362[tmp365_363] = (tmp365_362[tmp365_363] + O(paramArrayOfShort[i2]));
      }
      else if (jdMethod_try(paramArrayOfShort[i2]) == 9)
      {
        int tmp411_409 = i2;
        String[] tmp411_408 = arrayOfString;
        tmp411_408[tmp411_409] = (tmp411_408[tmp411_409] + K(paramArrayOfShort[i2]));
      }
      else if ((W[(paramArrayOfShort[i2] - 3840)] >> 20 & 0x1) == 0)
      {
        int tmp464_462 = i2;
        String[] tmp464_461 = arrayOfString;
        tmp464_461[tmp464_462] = (tmp464_461[tmp464_462] + "");
      }
      else
      {
        arrayOfShort[i1] = paramArrayOfShort[i2];
        i1 = (short)(i1 + 1);
      }
    }
    if (i1 > 0)
    {
      DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(J));
      try
      {
        int i3 = 0;
        for (int i4 = 0; (i4 < 99999) && (i3 != i1); i4 = (short)(i4 + 1))
        {
          int i5 = (short)(localDataInputStream.readShort() + 2);
          if (i4 == arrayOfShort[i3] - 3840)
          {
            int i6 = a(paramArrayOfShort, arrayOfShort[i3]);
            if (i6 != -1)
            {
              int tmp606_604 = i6;
              String[] tmp606_603 = arrayOfString;
              tmp606_603[tmp606_604] = (tmp606_603[tmp606_604] + localDataInputStream.readUTF());
              i3 = (short)(i3 + 1);
            }
            else
            {
              localDataInputStream.skipBytes(i5);
            }
          }
          else
          {
            localDataInputStream.skip(i5);
          }
        }
        return arrayOfString;
      }
      catch (Exception localException2) {}finally
      {
        try
        {
          localDataInputStream.close();
          localDataInputStream = null;
        }
        catch (Exception localException4) {}
      }
    }
  }
  
  public int L(short paramShort)
  {
    if (k(paramShort) == 0) {
      return S(paramShort);
    }
    int i1 = jdMethod_try(paramShort);
    if (i1 == 6) {
      return s(paramShort) * a.new * (1 + jdMethod_if(paramShort));
    }
    if (i1 == 9) {
      return jdMethod_byte(paramShort) * a.new * (1 + x(paramShort));
    }
    if (i1 == 7) {
      return a.n;
    }
    if (i1 == 90) {
      return fc[(paramShort - 10100)];
    }
    return (W[(paramShort - 3840)] & 0xFF) * a.new;
  }
  
  public boolean a(short paramShort)
  {
    return if[(paramShort - 3840)] >= 90;
  }
  
  public byte d(short paramShort)
  {
    byte b10 = (byte)Math.min(Math.max(0, z(paramShort)), a.m);
    if (j(paramShort) == a.ac) {
      b10 = (byte)a.ac;
    }
    return b10;
  }
  
  public void a(int paramInt1, int paramInt2, short paramShort)
  {
    Image localImage = null;
    int i1 = 0;
    int i2 = 0;
    int i3 = 15;
    int i4 = 15;
    int i5;
    if (k(paramShort) == 0)
    {
      if (G(paramShort) == 0)
      {
        i5 = j(paramShort);
        if ((i5 > 0) && (i5 == 3)) {
          a(paramInt1, paramInt2, 16, 17, 16 * (this.cJ.jdField_int / 2 % 3), 9, this.eD, 0);
        }
        localImage = this.af;
        i1 = d(paramShort) * i3;
        i2 = N(paramShort) * i4;
      }
      else if (o(paramShort))
      {
        localImage = this.cq;
        i1 = 17 * i3;
        i2 = 0;
      }
      else
      {
        localImage = this.fR;
        i1 = (N(paramShort) - 4) * i3;
        i2 = 0;
      }
    }
    else
    {
      localImage = this.cq;
      switch (jdMethod_try(paramShort))
      {
      case 0: 
        i1 = 0;
        break;
      case 1: 
        i1 = 1;
        break;
      case 2: 
      case 113: 
        i1 = 2;
        break;
      case 3: 
        i1 = 3;
        break;
      case 4: 
        i1 = 4;
        break;
      case 5: 
        i1 = 5;
        break;
      case 6: 
        i1 = 6;
        break;
      case 9: 
        i1 = 4;
        break;
      case 7: 
        localImage = fy;
        i1 = 0;
        break;
      case 8: 
        i1 = 8;
        break;
      case 100: 
        i1 = 9;
        break;
      case 101: 
        i1 = 3;
        break;
      case 102: 
      case 103: 
      case 105: 
      case 106: 
      case 110: 
      case 112: 
      case 114: 
      case 115: 
      case 122: 
      case 123: 
      case 125: 
      case 126: 
      case 127: 
        i1 = 10;
        break;
      case 91: 
        i1 = 16;
        break;
      case 90: 
        i1 = 15;
        break;
      case 120: 
      case 124: 
        i1 = 5;
        break;
      case 104: 
        i1 = 11;
        break;
      case 107: 
        i1 = 0;
        break;
      case 111: 
        i1 = 1;
        break;
      case 108: 
        i1 = 12;
        break;
      case 109: 
      case 121: 
        i1 = 13;
        break;
      case 116: 
      case 117: 
      case 118: 
      case 119: 
        i1 = 7;
      }
      if (paramShort == 3966) {
        i1 = 3;
      }
      i1 *= i3;
      i2 = 0;
    }
    a(paramInt1, paramInt2, i3, i4, i1, i2, localImage, 0);
    if (k(paramShort) == 0)
    {
      if (G(paramShort) != 0)
      {
        i5 = j(paramShort);
        if (i5 == 1)
        {
          a(paramInt1 - 4, paramInt2 + 3, 1, this.cJ.jdField_int / 2 % 3);
        }
        else if (i5 > 1)
        {
          a(paramInt1 - 4, paramInt2 + 3, 2, this.cJ.jdField_int / 2 % 3);
          if (i5 == 3) {
            a(paramInt1 - 4 + 2, paramInt2 + 3 + 3, 2, (this.cJ.jdField_int + 1) / 2 % 3);
          }
        }
      }
      else
      {
        i5 = j(paramShort);
        if ((i5 > 0) && (i5 < 3)) {
          a(paramInt1 - 4, paramInt2 + 3, j(paramShort), this.cJ.jdField_int / 2 % 3);
        }
      }
      if (v(paramShort)) {
        a(paramInt1 + 15 - 7, paramInt2, 7, 7, 168, 0, this.aH[10], 0);
      }
    }
    else if (jdMethod_try(paramShort) == 6)
    {
      i5 = jdMethod_if(paramShort);
      if (i5 == 1)
      {
        a(paramInt1, paramInt2, 1, this.cJ.jdField_int / 2 % 3);
      }
      else if (i5 > 1)
      {
        a(paramInt1, paramInt2, 2, this.cJ.jdField_int / 2 % 3);
        if (i5 == 3) {
          a(paramInt1 - 1, paramInt2 + 3, 2, (this.cJ.jdField_int + 1) / 2 % 3);
        }
      }
    }
    else if (jdMethod_try(paramShort) == 9)
    {
      i5 = x(paramShort);
      if (i5 == 1)
      {
        a(paramInt1, paramInt2, 1, this.cJ.jdField_int / 2 % 3);
      }
      else if (i5 > 1)
      {
        a(paramInt1, paramInt2, 2, this.cJ.jdField_int / 2 % 3);
        if (i5 == 3) {
          a(paramInt1 - 1, paramInt2 + 3, 2, (this.cJ.jdField_int + 1) / 2 % 3);
        }
      }
    }
  }
  
  public int Q(short paramShort)
  {
    return W[(paramShort - 3840)] >> 8 & 0xFFF;
  }
  
  public boolean jdMethod_for(short paramShort)
  {
    if (k(paramShort) != 1)
    {
      this.be = "使用失败";
      return false;
    }
    int i1;
    int i2;
    int i3;
    int i4;
    switch (jdMethod_try(paramShort))
    {
    case 0: 
    case 7: 
    case 8: 
      i1 = a.ac;
      if (jdMethod_try(paramShort) == 7) {
        i1 = a.n;
      } else {
        i1 = Q(paramShort);
      }
      i2 = this.cZ.a((byte)20) * i1 / a.new;
      i3 = a.ac;
      if (i1 <= a.n) {
        i3 = a.new;
      } else if (i1 <= a.o) {
        i3 = a.if;
      } else {
        i3 = a.if;
      }
      i2 = Math.max(i3, i2);
      i4 = this.cZ.a((byte)16);
      this.cZ.jdMethod_do((byte)16, i2);
      if (this.cZ.a((byte)16) > this.cZ.a((byte)20)) {
        this.cZ.jdMethod_if((byte)16, this.cZ.a((byte)20));
      }
      this.be = ("增加生命" + i2);
      if (this.cJ.jdField_do == 0)
      {
        a((short)i2, this.cZ.aP, this.cZ.aM, (byte)1);
        c((byte)1);
      }
      this.cZ.a((byte)0, paramShort, 1, true);
      break;
    case 1: 
      i1 = Q(paramShort);
      i2 = this.cZ.a((byte)26) * i1 / a.new;
      i3 = a.ac;
      if (i1 <= a.n) {
        i3 = a.F;
      } else if (i1 <= a.o) {
        i3 = a.Z;
      } else {
        i3 = a.s;
      }
      i2 = Math.max(i3, i2);
      i4 = this.cZ.a((byte)24);
      this.be = ("增加魔力" + i2);
      this.de = i2;
      this.cZ.a((byte)0, paramShort, 1, true);
      break;
    case 2: 
      this.be = "异常状态解除";
      this.cZ.N();
      this.cZ.a((byte)0, paramShort, 1, true);
      if (this.cJ.jdField_do == 0) {
        c((byte)a.C);
      }
      break;
    case 4: 
      this.be = "使用成功,什么也没有发生.";
      this.cZ.a((byte)0, paramShort, 1, true);
      break;
    case 5: 
    case 6: 
    case 9: 
      this.be = "使用成功,什么也没有发生.";
      this.cZ.a((byte)0, paramShort, 1, true);
      break;
    case 3: 
      this.cZ.gl = paramShort;
      this.cZ.i((byte)a.char);
    }
    return true;
  }
  
  public short jdMethod_if(byte paramByte)
  {
    for (int i1 = 0; i1 < this.cZ.gJ[1]; i1 = (byte)(i1 + 1)) {
      if (jdMethod_try(this.cZ.gw[1][i1]) == paramByte) {
        return this.cZ.gw[1][i1];
      }
    }
    return -1;
  }
  
  public void jdMethod_if(short paramShort, boolean paramBoolean)
  {
    if (k(paramShort) != 1)
    {
      this.cJ.a("使用失败.", (short)30, false, a.ae);
      return;
    }
    byte b11;
    int i3;
    int i4;
    int i6;
    int i7;
    int i8;
    switch (jdMethod_try(paramShort))
    {
    case 91: 
      if (this.aG.jdMethod_int(6717))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 123: 
      if (a1 == 1)
      {
        this.cJ.a("该功能暂时关闭.", (short)0, false, a.ae);
        return;
      }
      if (this.cZ.a8)
      {
        this.cJ.a("摆摊中不能摆离线摊.", (short)0, false, a.ae);
        return;
      }
      this.cZ.y();
      this.cJ.bO = this.cZ.a((byte)0);
      byte b10 = 0;
      for (int i1 = 0; i1 < this.cZ.gJ[0]; i1 = (byte)(i1 + 1)) {
        if (!v(this.cZ.gw[0][i1])) {
          b10 = (byte)(b10 + 1);
        }
      }
      if (b10 == 0)
      {
        this.cJ.a("背包里没有能卖的东西.", (short)0, false, a.ae);
        return;
      }
      short[] arrayOfShort1 = new short[b10];
      b10 = 0;
      for (int i2 = 0; i2 < this.cZ.gJ[0]; i2 = (byte)(i2 + 1)) {
        if (!v(this.cZ.gw[0][i2]))
        {
          arrayOfShort1[b10] = this.cZ.gw[0][i2];
          b10 = (byte)(b10 + 1);
        }
      }
      this.i.a(1, (byte)0, b10, arrayOfShort1, new short[arrayOfShort1.length]);
      short[] arrayOfShort2 = new short[this.cZ.gJ[0]];
      System.arraycopy(this.cZ.gw[0], 0, arrayOfShort2, 0, this.cZ.gJ[0]);
      this.i.a(arrayOfShort2, false);
      for (b11 = 0; b11 < this.cJ.bs[0]; b11 = (byte)(b11 + 1)) {
        this.cJ.lK[0][b11] = (L(this.cJ.nl[0][b11]) / a.t);
      }
      this.f = paramShort;
      this.cJ.jdField_do = -76;
      break;
    case 122: 
      if (this.cZ.fj != 17)
      {
        this.cJ.a("公会长才能使用.", (short)30, false, a.ae);
        return;
      }
      this.cJ.mM = new m(this);
      this.cJ.jdField_do = -74;
      break;
    case 127: 
      if (this.aG.jdMethod_int(6716))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 126: 
      if (cu == a.char)
      {
        this.cJ.a("该功能暂时关闭.", (short)0, false, a.ae);
        return;
      }
      if (this.aG.jdMethod_int(5851))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 125: 
      if (this.aG.jdMethod_int(5847))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 121: 
      b11 = (byte)Q(paramShort);
      this.i.a(b11, paramShort);
      break;
    case 124: 
      if (this.cZ.fj != 17)
      {
        this.cJ.a("公会长才能使用.", (short)30, false, a.ae);
        return;
      }
      this.bx = new a(this);
      this.bx.a((byte)0);
      break;
    case 120: 
      this.bx = new a(this);
      this.bx.a((byte)1);
      break;
    case 119: 
      if (f0 >= 5)
      {
        this.cJ.a("宠物孔数达到上限,不能使用.", (short)30, false, a.ae);
        return;
      }
      this.cJ.jdField_do = 21;
      if (this.aG.jdMethod_int(4060))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      break;
    case 116: 
    case 117: 
    case 118: 
      if (this.jdField_try <= a.ac)
      {
        this.cJ.a("有宠物才能使用.", (short)30, false, a.ae);
        return;
      }
      switch (jdMethod_try(paramShort))
      {
      case 117: 
        i3 = 0;
        for (i4 = 0; i4 < this.jdField_try; i4 = (byte)(i4 + 1)) {
          if (this.b7[i4].a((byte)40) <= a.ac) {
            i3 = 1;
          }
        }
        if (i3 == 0)
        {
          this.cJ.a("没有宠物需要唤醒.", (short)30, false, a.ae);
          return;
        }
        L();
        this.cJ.mz = 0;
        this.cJ.bf = 0;
        this.cJ.jdField_do = -65;
        break;
      case 116: 
        L();
        this.cJ.mz = 0;
        this.cJ.bf = 0;
        this.cJ.jdField_do = -69;
        break;
      case 118: 
        i4 = 0;
        for (int i5 = 0; i5 < this.jdField_try; i5 = (byte)(i5 + 1)) {
          if (this.b7[i5].a((byte)12) != 0) {
            i4 = 1;
          }
        }
        if (i4 == 0)
        {
          this.cJ.a("宠物都处于封印状态.", (short)30, false, a.ae);
          return;
        }
        L();
        this.cJ.mz = 0;
        this.cJ.bf = 0;
        this.cJ.jdField_do = -66;
      }
      break;
    case 115: 
      i3 = 0;
      for (i4 = 0; i4 < this.cZ.a7.length; i4 = (byte)(i4 + 1)) {
        if (j(this.cZ.a7[i4]) >= a.i) {
          i3 = (byte)(i3 + 1);
        }
      }
      if (i3 == a.ac)
      {
        this.cJ.a("没有需要解绑的装备.", (short)30, false, a.ae);
        return;
      }
      String[] arrayOfString1 = new String[i3];
      short[] arrayOfShort3 = new short[i3];
      i3 = 0;
      for (i6 = 0; i6 < this.cZ.a7.length; i6 = (byte)(i6 + 1)) {
        if (j(this.cZ.a7[i6]) >= a.i)
        {
          arrayOfShort3[i3] = this.cZ.a7[i6];
          i3 = (byte)(i3 + 1);
        }
      }
      for (i6 = 0; i6 < arrayOfShort3.length - 1; i6 = (short)(i6 + 1)) {
        for (i7 = (short)(i6 + 1); i7 < arrayOfShort3.length; i7 = (short)(i7 + 1)) {
          if (arrayOfShort3[i6] > arrayOfShort3[i7])
          {
            i8 = arrayOfShort3[i6];
            arrayOfShort3[i6] = arrayOfShort3[i7];
            arrayOfShort3[i7] = i8;
          }
        }
      }
      arrayOfString1 = a(arrayOfShort3);
      this.bf = new v(this);
      this.bf.jdField_int = arrayOfString1;
      this.bf.a = arrayOfShort3;
      arrayOfString1 = null;
      arrayOfShort3 = null;
      this.cJ.jdField_do = -51;
      break;
    case 113: 
      this.ay = paramShort;
      this.az = ((byte)Q(paramShort));
      this.cZ.y();
      i6 = this.cZ.gJ[0];
      if (this.az == 0)
      {
        i6 = 0;
        for (i7 = 0; i7 < this.cZ.gJ[0]; i7 = (byte)(i7 + 1)) {
          if (6 == jdMethod_try(this.cZ.gw[0][i7])) {
            i6 = (byte)(i6 + 1);
          }
        }
      }
      short[] arrayOfShort4 = new short[i6];
      i6 = 0;
      for (i8 = 0; i8 < this.cZ.gJ[0]; i8 = (byte)(i8 + 1)) {
        if ((this.az != 0) || (6 == jdMethod_try(this.cZ.gw[0][i8])))
        {
          arrayOfShort4[i6] = this.cZ.gw[0][i8];
          i6 = (byte)(i6 + 1);
        }
      }
      this.i.a(1, (byte)0, i6, arrayOfShort4, new short[arrayOfShort4.length]);
      this.i.a(arrayOfShort4, true);
      this.cJ.jdField_do = -39;
      break;
    case 101: 
      if (!paramBoolean)
      {
        this.cZ.gl = paramShort;
        this.cZ.i((byte)a.t);
      }
      else
      {
        this.cJ.jdField_do = 0;
        this.cZ.au();
        this.cZ.a((byte)1, paramShort, 1, true);
      }
      break;
    case 100: 
      if (jdMethod_new((byte)0))
      {
        this.cJ.a("使用失败,双倍经验模组不能叠加使用.", (short)30, false, a.ae);
        return;
      }
      if (this.aG.jdMethod_int(6704))
      {
        this.aG.jdMethod_do((byte)Q(paramShort));
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 102: 
      if (this.aG.jdMethod_int(6706))
      {
        this.aG.jdMethod_for(q.cB);
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 103: 
      i8 = Q(paramShort);
      if (this.cZ.a((byte)14) > i8)
      {
        this.cJ.a("使用失败,当前级别超过洗点卡使用级别.", (short)30, false, a.ae);
      }
      else if (this.cZ.a((byte)14) == 1)
      {
        this.cJ.a("使用失败,等级2级以上才可使用.", (short)30, false, a.ae);
      }
      else
      {
        this.cJ.jdField_do = 21;
        if (this.aG.jdMethod_int(6703))
        {
          this.aG.jdMethod_for(q.cB);
          this.aG.jdMethod_new(paramShort);
          this.aG.jdMethod_do(0);
          this.aG.jdMethod_if();
        }
      }
      break;
    case 104: 
      this.cJ.jdMethod_new(true);
      break;
    case 105: 
      if (this.cZ.fj != 17)
      {
        this.cJ.a("只有公会长才可使用.", (short)30, false, a.ae);
      }
      else
      {
        if (this.aG.jdMethod_int(6707))
        {
          this.aG.jdMethod_new(paramShort);
          this.aG.jdMethod_do(1);
          this.aG.jdMethod_if();
        }
        this.cJ.jdField_do = 21;
      }
      break;
    case 106: 
      if (this.aG.jdMethod_int(6707))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_do(0);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 107: 
      if (!paramBoolean)
      {
        this.cZ.jdMethod_if((byte)16, this.cZ.a((byte)20));
        if (this.cZ.a((byte)1, paramShort, 1, true))
        {
          this.i.jdMethod_if((byte)1, paramShort, (byte)1);
          this.cJ.a(a.e, (short)30, false, a.ae);
        }
      }
      else if (this.cZ.a((byte)16) < this.cZ.a((byte)20) / 2)
      {
        this.cZ.jdMethod_if((byte)16, this.cZ.a((byte)20));
        this.cZ.a((byte)1, paramShort, 1, true);
      }
      break;
    case 111: 
      this.de = this.cZ.a((byte)26);
      if (!paramBoolean)
      {
        if (this.cZ.a((byte)1, paramShort, 1, true))
        {
          this.i.jdMethod_if((byte)1, paramShort, (byte)1);
          this.cJ.a(a.ad, (short)30, false, a.ae);
        }
      }
      else {
        this.cZ.a((byte)1, paramShort, 1, true);
      }
      break;
    case 108: 
      byte b12 = (byte)(Q(paramShort) + 1);
      String str = G[(b12 - 1)];
      if (jdMethod_new(b12))
      {
        this.cJ.a("不能重复使用" + str + ".", (short)30, false, a.ae);
        return;
      }
      if (this.aG.jdMethod_int(6711))
      {
        this.aG.jdMethod_new(paramShort);
        this.aG.jdMethod_do(b12);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_do = 21;
      break;
    case 109: 
      this.i.a((byte)0, paramShort);
      break;
    case 110: 
      if (this.cZ.gE)
      {
        this.cJ.a("组队期间不能修改昵称.", (short)30, false, a.ae);
        return;
      }
      if (this.cJ.ki)
      {
        this.cJ.a("公会战期间不能修改昵称.", (short)30, false, a.ae);
        return;
      }
      if (this.cZ.a8)
      {
        this.cJ.a("摆摊期间不能修改昵称.", (short)30, false, a.ae);
        return;
      }
      this.bM = new az(this);
      this.bM.a();
      break;
    case 112: 
      byte[] arrayOfByte = new byte[a.t];
      switch (this.cZ.bo)
      {
      case 0: 
        arrayOfByte[0] = 0;
        arrayOfByte[1] = ag.eV;
        break;
      case 1: 
        arrayOfByte[0] = 1;
        arrayOfByte[1] = ag.d8;
        break;
      case 2: 
        arrayOfByte[0] = 3;
        arrayOfByte[1] = ag.hI;
        break;
      case 3: 
        arrayOfByte[0] = 2;
        arrayOfByte[1] = ag.dV;
      }
      this.e3 = this.cZ.jdMethod_if(arrayOfByte);
      String[] arrayOfString2 = new String[this.e3.length];
      arrayOfString2 = a(this.e3);
      if (arrayOfString2 == null)
      {
        this.cJ.a("没有可遗忘的技能.", (short)30, false, a.ae);
      }
      else
      {
        this.cJ.j1 = 52;
        this.cJ.c9 = new String[] { "遗忘", "返回" };
        this.cJ.ip.removeAllElements();
        this.cJ.bS.removeAllElements();
        for (int i9 = 0; i9 < arrayOfString2.length; i9 = (byte)(i9 + 1)) {
          this.cJ.ip.addElement(arrayOfString2[i9]);
        }
        this.i.jdMethod_for();
        this.cJ.jdField_do = 26;
      }
      break;
    case 114: 
      this.i.jdMethod_if();
      this.cJ.jdMethod_for(true);
    }
  }
  
  public String[] a(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    if (paramArrayOfShort.length == 0) {
      return null;
    }
    short[] arrayOfShort = new short[paramArrayOfShort.length];
    System.arraycopy(paramArrayOfShort, 0, arrayOfShort, 0, paramArrayOfShort.length);
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(bg);
    arrayOfString = new String[paramArrayOfShort.length];
    try
    {
      for (int i1 = 0; i1 < arrayOfShort.length; i1++) {
        if (v(arrayOfShort[i1]))
        {
          arrayOfString[i1] = l(arrayOfShort[i1]);
        }
        else if (o(arrayOfShort[i1]))
        {
          if (a0 != null) {
            arrayOfString[i1] = a0[(arrayOfShort[i1] - 5000)];
          }
        }
        else if (jdMethod_try(arrayOfShort[i1]) == 91)
        {
          if (bc == null) {
            arrayOfString[i1] = "";
          } else {
            arrayOfString[i1] = bc[(arrayOfShort[i1] - 10200)];
          }
        }
        else if (jdMethod_try(arrayOfShort[i1]) == 7)
        {
          arrayOfString[i1] = U(arrayOfShort[i1]);
        }
        else if (jdMethod_try(arrayOfShort[i1]) == 90)
        {
          arrayOfString[i1] = w(arrayOfShort[i1]);
        }
        else if (jdMethod_try(arrayOfShort[i1]) == 6)
        {
          arrayOfString[i1] = T(arrayOfShort[i1]);
        }
        else if (jdMethod_try(arrayOfShort[i1]) == 9)
        {
          arrayOfString[i1] = jdMethod_char(arrayOfShort[i1]);
        }
        else
        {
          if (k(arrayOfShort[i1]) == 0)
          {
            int tmp302_300 = i1;
            short[] tmp302_299 = arrayOfShort;
            tmp302_299[tmp302_300] = ((short)(tmp302_299[tmp302_300] / 3));
          }
          else
          {
            int tmp314_312 = i1;
            short[] tmp314_311 = arrayOfShort;
            tmp314_311[tmp314_312] = ((short)(tmp314_311[tmp314_312] - 2560));
          }
          StringBuffer localStringBuffer = new StringBuffer();
          int i2;
          if (i1 == 0)
          {
            localByteArrayInputStream.skip(arrayOfShort[i1] * 10);
            for (i2 = 0; i2 < 5; i2++) {
              localStringBuffer.append((char)(localByteArrayInputStream.read() | localByteArrayInputStream.read() << 8));
            }
            arrayOfString[i1] = localStringBuffer.toString().trim();
          }
          else if (arrayOfShort[i1] != arrayOfShort[(i1 - 1)])
          {
            localByteArrayInputStream.skip((arrayOfShort[i1] - arrayOfShort[(i1 - 1)] - 1) * 10);
            for (i2 = 0; i2 < 5; i2++) {
              localStringBuffer.append((char)(localByteArrayInputStream.read() | localByteArrayInputStream.read() << 8));
            }
            arrayOfString[i1] = localStringBuffer.toString().trim();
          }
          else
          {
            arrayOfString[i1] = arrayOfString[(i1 - 1)];
          }
        }
      }
      return arrayOfString;
    }
    catch (Exception localException2) {}finally
    {
      try
      {
        localByteArrayInputStream.close();
        localByteArrayInputStream = null;
      }
      catch (Exception localException4)
      {
        a(localException4);
      }
    }
  }
  
  public static byte z(short paramShort)
  {
    if (o(paramShort)) {
      return -1;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    paramShort = (short)(paramShort / a.i);
    return (byte)Math.min(a.I, Math.max(0, paramShort / a.F));
  }
  
  public static byte j(short paramShort)
  {
    if (o(paramShort)) {
      return 0;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    paramShort = (short)(paramShort / a.i);
    return (byte)(paramShort % a.F / a.n);
  }
  
  public static int b(short paramShort)
  {
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    return V[(z(paramShort) * a.C + j(paramShort))];
  }
  
  public static byte G(short paramShort)
  {
    if (o(paramShort)) {
      return (byte)a.e;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    paramShort = (short)(paramShort / a.i);
    if (paramShort % a.n <= a.i) {
      return (byte)a.ac;
    }
    return (byte)(paramShort % a.n - a.i);
  }
  
  public static boolean v(short paramShort)
  {
    if (k(paramShort) != 0) {
      return false;
    }
    return paramShort >= 21000;
  }
  
  public static boolean o(short paramShort)
  {
    if (k(paramShort) != 0) {
      return false;
    }
    return (paramShort >= 5000) && (paramShort < 5100);
  }
  
  public static byte N(short paramShort)
  {
    if (k(paramShort) == 1) {
      return -1;
    }
    if (o(paramShort)) {
      return (byte)a.n;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    paramShort = (short)(paramShort / a.i);
    return (byte)(paramShort % a.n);
  }
  
  public static byte jdMethod_do(short paramShort)
  {
    if (o(paramShort)) {
      return 0;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    return (byte)(paramShort % a.i * a.t);
  }
  
  public String a(short paramShort, boolean paramBoolean)
  {
    if (paramShort < -1) {
      return "";
    }
    short s1 = paramShort;
    int i1;
    if (o(paramShort))
    {
      str = b4[(paramShort - 5000)];
      if (paramBoolean) {
        for (i1 = 0; i1 < dt.length; i1 = (byte)(i1 + 1)) {
          if (paramShort == dt[i1])
          {
            str = str + " " + dC[i1];
            break;
          }
        }
      }
      return str;
    }
    if (v(s1)) {
      s1 = J(s1);
    }
    String str = null;
    str = "等级:" + (z(s1) + a.char) * a.J + "\001";
    str = str + "贵重程度:";
    switch (j(s1))
    {
    case 0: 
      str = str + "普通";
      break;
    case 1: 
      str = str + "高级";
      break;
    case 2: 
      str = str + "稀有";
      break;
    case 3: 
      str = str + "极品";
    }
    str = str + "\001";
    str = str + "孔数:" + jdMethod_do(s1) + "\001";
    str = str + "提高";
    switch (q(s1))
    {
    case 0: 
      str = str + "物攻" + jdMethod_void(s1);
      break;
    case 1: 
      str = str + "物防" + jdMethod_void(s1);
      break;
    case 2: 
      str = str + "魔攻" + jdMethod_void(s1);
      break;
    case 3: 
      str = str + "魔防" + jdMethod_void(s1);
      break;
    case 4: 
      str = str + "物攻" + jdMethod_void(s1) + "\001提高魔攻" + jdMethod_void(s1);
    }
    str = str + "\001";
    if (v(paramShort))
    {
      str = str + "合成属性:\001";
      i1 = 0;
      if ((i1 = jdMethod_null(paramShort)) > 0) {
        str = str + " 幸运+" + i1 + "\001";
      }
      if ((i1 = g(paramShort)) > 0) {
        str = str + " 敏捷+" + i1 + "\001";
      }
      if ((i1 = E(paramShort)) > 0) {
        str = str + " 暴击+" + i1 + "\001";
      }
      if ((i1 = C(paramShort)) > 0) {
        str = str + " 命中+" + i1 + "\001";
      }
      if ((i1 = p(paramShort)) > 0) {
        str = str + " 威力+" + i1 + "\001";
      }
      if ((i1 = n(paramShort)) > 0) {
        str = str + " 攻击距离+" + i1 + "\001";
      }
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      if ((i1 = f(paramShort)) > 0)
      {
        i2 = (1 + z(paramShort)) * (1 + j(paramShort));
        i3 = i2 * i1;
        i4 = Math.max(10, i3 + 5);
        i5 = i4 / i2 + (i4 % i2 > 0 ? 1 : 0);
        i6 = (short)Math.max(1, i3 / 5);
        str = str + " 吸血+" + i6 + "(" + i1 + "/" + i5 + ")\001";
      }
      if ((i1 = t(paramShort)) > 0)
      {
        i2 = (1 + z(paramShort)) * (1 + j(paramShort));
        i3 = i2 * i1;
        i4 = Math.max(40, i3 + 20);
        i5 = i4 / i2 + (i4 % i2 > 0 ? 1 : 0);
        i6 = (short)Math.max(1, i3 / 20);
        str = str + " 吸魔+" + i6 + "(" + i1 + "/" + i5 + ")\001";
      }
    }
    return str;
  }
  
  public static int S(short paramShort)
  {
    if (o(paramShort)) {
      return C[(paramShort - 5000)];
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    return a.new * (b(paramShort) >> a.A & 0x7F) * (z(paramShort) + a.char);
  }
  
  public static int jdMethod_void(short paramShort)
  {
    if (o(paramShort)) {
      return a.ac;
    }
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    int i1 = (b(paramShort) & 0x7F) * (z(paramShort) + a.char);
    int i2 = (byte)(paramShort / a.i % a.n);
    if (i2 <= a.i) {
      switch (i2)
      {
      case 0: 
        i1 += i1 * (b(paramShort) >> a.e & 0xF) / a.n;
        break;
      case 2: 
        i1 += i1 * (b(paramShort) >> a.j & 0xF) / a.n;
        break;
      case 3: 
        i1 += i1 * (b(paramShort) >> a.T & 0xF) / a.n;
      }
    }
    switch (i2)
    {
    case 0: 
      i1 = i1;
      break;
    case 1: 
      i1 = i1;
      break;
    case 2: 
      i1 = i1;
      break;
    case 3: 
      i1 = i1;
      break;
    case 4: 
      i1 = i1 * a.null / a.ad;
      break;
    case 5: 
      i1 = i1 * a.E / a.F;
      break;
    case 6: 
      i1 = i1 * a.T / a.new;
      break;
    case 7: 
      i1 = i1 * a.n / a.new;
      break;
    case 8: 
      i1 = i1 * a.v / a.F;
      break;
    case 9: 
      i1 = i1 * a.i / a.ad;
    }
    return i1;
  }
  
  public static byte q(short paramShort)
  {
    if (v(paramShort)) {
      paramShort = J(paramShort);
    }
    switch (G(paramShort))
    {
    case 0: 
      int i1 = jdMethod_do(paramShort);
      if (i1 == a.ac)
      {
        if (paramShort / a.i % a.n == a.char) {
          return (byte)a.t;
        }
        return (byte)a.ac;
      }
      if (i1 == a.t) {
        return (byte)a.t;
      }
      if (i1 == a.C) {
        return (byte)a.C;
      }
    case 1: 
      return (byte)a.i;
    case 2: 
      return (byte)a.char;
    case 3: 
      return (byte)a.t;
    case 4: 
      return (byte)a.ac;
    case 5: 
      return (byte)a.char;
    case 6: 
      return (byte)a.i;
    case 7: 
      return -1;
    }
    return -1;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 <= 0) || (paramInt3 > 2)) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    if (paramInt3 == 1) {
      switch (paramInt4)
      {
      case 0: 
        i3 = 23;
        i4 = 0;
        i1 = 3;
        i2 = 9;
        break;
      case 1: 
        i3 = 26;
        i4 = 0;
        i1 = 5;
        i2 = 9;
        i5 = 1;
        i6 = 0;
        break;
      case 2: 
        i3 = 31;
        i4 = 0;
        i1 = 7;
        i2 = 9;
        i5 = 2;
        i6 = 0;
      }
    } else if (paramInt3 == 2) {
      switch (paramInt4)
      {
      case 0: 
        i3 = 0;
        i4 = 0;
        i1 = 5;
        i2 = 9;
        break;
      case 1: 
        i3 = 5;
        i4 = 0;
        i1 = 7;
        i2 = 9;
        i5 = 1;
        i6 = 0;
        break;
      case 2: 
        i3 = 12;
        i4 = 0;
        i1 = 11;
        i2 = 9;
        i5 = 3;
        i6 = 0;
      }
    }
    a(paramInt1 + 8 - i5, paramInt2 - i6, i1, i2, i3, i4, this.eD, 0);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, short paramShort, int paramInt7)
  {
    int i1 = j(paramShort);
    if (i1 == 1)
    {
      a(paramInt1 + paramInt3, paramInt2 + paramInt4, 1, paramInt7 / 2 % 3);
    }
    else if (i1 > 1)
    {
      a(paramInt1 + paramInt3, paramInt2 + paramInt4, 2, paramInt7 / 2 % 3);
      if (i1 == 3) {
        a(paramInt1 + paramInt5, paramInt2 + paramInt6, 2, (paramInt7 + 1) / 2 % 3);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2, short paramShort1, short paramShort2, short paramShort3, short paramShort4, short paramShort5, short paramShort6, short paramShort7, int paramInt3)
  {
    int i1 = (short)(paramInt1 - 13);
    int i2 = (short)(paramInt2 + 17);
    int i3 = (short)(paramInt1 + 2);
    int i4 = (short)paramInt2;
    int i5 = (short)(paramInt1 + 1);
    int i6 = (short)(paramInt2 + 9);
    int i7 = (short)(paramInt1 + 9);
    int i8 = (short)(paramInt2 + 8);
    int i9 = (short)(paramInt1 + 1);
    int i10 = (short)(paramInt2 + 16);
    int i11 = (short)(paramInt1 + 2);
    int i12 = (short)(paramInt2 + 23);
    if (paramByte1 == 1)
    {
      i1 = (short)(paramInt1 - 12);
      i2 = (short)(paramInt2 + 18);
      i3 = (short)(paramInt1 + 2);
      i4 = (short)(paramInt2 + 1);
      i5 = (short)(paramInt1 + 1);
      i6 = (short)(paramInt2 + 10);
      i7 = (short)(paramInt1 + 9);
      i8 = (short)(paramInt2 + 9);
      i9 = (short)(paramInt1 + 1);
      i10 = (short)(paramInt2 + 17);
      i11 = (short)(paramInt1 + 2);
      i12 = (short)(paramInt2 + 23);
    }
    if (paramShort1 < 0) {
      paramShort1 = 0;
    }
    if (paramShort1 >= 0)
    {
      i13 = j(paramShort1);
      if (i13 == 3) {
        a(i1 - 2, i2, 16, 17, 16 * (paramInt3 / 2 % 3), 9, this.eD, 1);
      }
      a(i1, i2, 15, 15, d(paramShort1) * 15, paramByte2 * 15, this.af, 1);
      if ((i13 > 0) && (i13 < 3)) {
        a(i1 - 3, i2 + 4, i13, paramInt3 / 2 % 3);
      }
    }
    else
    {
      a(i1, i2, 15, 15, 0, paramByte2 * 15, this.af, 1);
    }
    int i13 = (byte)(paramInt3 / 10 % 5);
    if (paramShort6 >= 0)
    {
      a(i11, i12, 14, 8, d(paramShort6) * 14, 0, this.fn, 0);
      if ((i13 == 0) || (j(paramShort6) == 3)) {
        a(i11, i12, -6, -2, -4, 0, paramShort6, paramInt3);
      }
    }
    if (paramShort2 >= 0)
    {
      a(i5, i6, 17, 9, d(paramShort2) * 17, 0, this.jdField_goto, 0);
      if ((i13 == 1) || (j(paramShort2) == 3)) {
        a(i5, i6, -2, 2, -4, 1, paramShort2, paramInt3);
      }
    }
    if (paramShort5 >= 0)
    {
      a(i9, i10, 17, 8, d(paramShort5) * 17, 0, this.gc, 0);
      if ((i13 == 2) || (j(paramShort5) == 3)) {
        a(i9, i10, -2, 1, -4, 3, paramShort5, paramInt3);
      }
    }
    if (paramShort3 >= 0)
    {
      a(i7, i8, 14, 20, d(paramShort3) * 14, paramByte2 * 20, this.b5, 0);
      if ((i13 == 3) || (j(paramShort3) == 3)) {
        a(i7, i8, -2, 2, 2, 5, paramShort3, paramInt3);
      }
    }
    if (paramShort4 >= 0)
    {
      a(i3, i4, 14, 10, d(paramShort4) * 14, 0, this.cm, 0);
      if ((i13 == 4) || (j(paramShort4) == 3)) {
        a(i3, i4, 1, 2, 3, 3, paramShort4, paramInt3);
      }
    }
    if ((paramShort7 >= 0) && (fZ != null)) {
      a5.a(paramInt1 + cI[(paramShort7 - 5000)][paramByte1][0], paramInt2 + cI[(paramShort7 - 5000)][paramByte1][1], dG, fZ[(paramShort7 - 5000)], 0);
    }
  }
  
  public byte jdMethod_int(short paramShort)
  {
    paramShort = (short)(paramShort - 5100);
    return (byte)(paramShort % a.C);
  }
  
  public byte jdMethod_byte(short paramShort)
  {
    paramShort = (short)(paramShort - 5100);
    return (byte)(paramShort / a.long + a.char);
  }
  
  public byte x(short paramShort)
  {
    paramShort = (short)(paramShort - 5100);
    return (byte)(paramShort % a.long / a.C);
  }
  
  public String jdMethod_char(short paramShort)
  {
    String str = null;
    switch (x(paramShort))
    {
    case 0: 
      str = "下等";
      break;
    case 1: 
      str = "中等";
      break;
    case 2: 
      str = "高等";
      break;
    case 3: 
      str = "上等";
    }
    switch (jdMethod_int(paramShort))
    {
    case 0: 
      str = str + "皮";
      break;
    case 1: 
      str = str + "肉";
      break;
    case 2: 
      str = str + "骨";
      break;
    case 3: 
      str = str + "爪";
    }
    return str;
  }
  
  public String K(short paramShort)
  {
    return "剥取类素材,可作为宠物食物\001 等级:" + 5 * jdMethod_byte(paramShort);
  }
  
  public byte r(short paramShort)
  {
    paramShort = (short)(paramShort - 20000);
    return (byte)(paramShort % a.C);
  }
  
  public byte s(short paramShort)
  {
    paramShort = (short)(paramShort - 20000);
    return (byte)(paramShort / a.long + a.char);
  }
  
  public byte jdMethod_if(short paramShort)
  {
    paramShort = (short)(paramShort - 20000);
    return (byte)(paramShort % a.long / a.C);
  }
  
  public String T(short paramShort)
  {
    String str = null;
    switch (r(paramShort))
    {
    case 0: 
      str = "铂";
      break;
    case 1: 
      str = "镭";
      break;
    case 2: 
      str = "钛";
      break;
    case 3: 
      str = "铀";
    }
    switch (jdMethod_if(paramShort))
    {
    case 0: 
      str = str + "晶碎片";
      break;
    case 1: 
      str = str + "晶小块";
      break;
    case 2: 
      str = str + "晶大块";
      break;
    case 3: 
      str = str + "晶核";
    }
    return str;
  }
  
  public String O(short paramShort)
  {
    return "合成用材料\001 等级:" + 5 * s(paramShort);
  }
  
  public void jdMethod_void()
  {
    try
    {
      this.b0 = new x(this);
      this.b0.a("/boy.dat");
      this.b0.a(59, 0, ag.hR);
    }
    catch (IOException localIOException) {}
  }
  
  public void jdMethod_char(String paramString)
  {
    Alert localAlert = new Alert("错误", paramString, null, AlertType.WARNING);
    localAlert.setTimeout(3000);
    Display.getDisplay(this.fG).setCurrent(localAlert);
  }
  
  public static boolean jdMethod_try(String paramString)
  {
    return (paramString.trim().length() <= 6) && (paramString.trim().length() >= 3);
  }
  
  public static boolean j(String paramString)
  {
    return (paramString.trim().length() >= 4) && (paramString.trim().length() <= 10);
  }
  
  public static boolean jdMethod_new(String paramString)
  {
    if (paramString.trim().length() == 0) {
      return false;
    }
    return Long.parseLong(paramString) > 13000000000L;
  }
  
  public void x(byte paramByte)
  {
    try
    {
      if ((this.aG != null) && (this.aG.jdMethod_int(2508)))
      {
        this.aG.jdMethod_new(this.cJ.jdField_if);
        this.aG.jdMethod_new(this.cZ.aP);
        this.aG.jdMethod_new(this.cZ.aM);
        this.aG.jdMethod_do(paramByte);
        this.aG.jdMethod_do(0);
        this.aG.jdMethod_if();
      }
    }
    catch (Exception localException) {}
  }
  
  public byte[] e(byte paramByte)
  {
    int i1 = this.fe.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (this.fe[i2] == paramByte) {
        return this.ae[i2];
      }
    }
    return null;
  }
  
  public void jdMethod_if(byte[] paramArrayOfByte)
  {
    try
    {
      DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
      localDataInputStream.skipBytes(6);
      int i1 = this.fe.length;
      int i2 = -1;
      for (int i3 = 0; i3 < i1; i3++) {
        if (this.fe[i3] == 0)
        {
          i2 = i3;
          break;
        }
      }
      if (i2 == -1)
      {
        i3 = this.cs[0];
        i2 = 0;
        for (int i4 = 1; i4 < i1; i4++) {
          if (i3 > this.cs[i4])
          {
            i3 = this.cs[i4];
            i2 = i4;
          }
        }
        if (this.cs[i2] >= 100)
        {
          for (i4 = 0; i4 < i1; i4++)
          {
            int tmp148_146 = i4;
            byte[] tmp148_143 = this.cs;
            tmp148_143[tmp148_146] = ((byte)(tmp148_143[tmp148_146] - 100));
          }
          this.jdField_null = ((byte)(this.jdField_null - 100));
        }
      }
      this.fe[i2] = localDataInputStream.readByte();
      this.ae[i2] = null;
      this.ae[i2] = new byte[localDataInputStream.readShort()];
      localDataInputStream.readFully(this.ae[i2]);
      this.jdField_null = ((byte)(this.jdField_null + 1));
      this.cs[i2] = this.jdField_null;
      this.q = false;
      this.dM = null;
      this.fQ = 0;
    }
    catch (Exception localException) {}
  }
  
  public void S()
  {
    for (int i1 = 0; i1 < 4; i1++) {
      if ((al[i1] > 0) && (F(al[i1]) == -1) && (!c(al[i1])))
      {
        this.q = true;
        this.fQ = this.cH[al[i1]];
        break;
      }
    }
  }
  
  public int F(short paramShort)
  {
    int i1 = this.fe.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (this.fe[i2] == this.cH[paramShort]) {
        return i2;
      }
    }
    return -1;
  }
  
  public boolean c(short paramShort)
  {
    int i1 = fE.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (fE[i2] == this.cH[paramShort]) {
        return true;
      }
    }
    return false;
  }
  
  public boolean jdMethod_new(byte paramByte)
  {
    return c7[paramByte];
  }
  
  public void a(byte paramByte, boolean paramBoolean)
  {
    c7[paramByte] = paramBoolean;
  }
  
  public static int jdMethod_do(int paramInt)
  {
    paramInt %= 360;
    if (paramInt < 0) {
      paramInt = 360 + paramInt;
    }
    if (paramInt <= 90) {
      return fd[paramInt];
    }
    if (paramInt <= 180) {
      return fd[(180 - paramInt)];
    }
    if (paramInt <= 270) {
      return -fd[(paramInt - 180)];
    }
    return -fd[(360 - paramInt)];
  }
  
  public static int jdMethod_new(int paramInt)
  {
    return jdMethod_do(paramInt + 90);
  }
  
  public static int jdMethod_int(int paramInt)
  {
    if (paramInt <= a.ac) {
      return a.ac;
    }
    int i1 = a.t;
    int i2 = a.ac;
    for (int i3 = 0; i3 < a.p; i3++)
    {
      i1 = (i1 + paramInt / i1) / a.t;
      if ((i2 <= i1) && (i3 != a.ac)) {
        break;
      }
      i2 = i1;
    }
    return i1;
  }
  
  public void a(short paramShort1, short paramShort2, String paramString, boolean paramBoolean, short paramShort3, short paramShort4, short paramShort5, short paramShort6, short paramShort7, short paramShort8, short paramShort9, short paramShort10, byte paramByte)
  {
    if (e8 >= 18) {
      a(true);
    }
    gd[e8] = paramShort1;
    m[e8] = paramShort2;
    bb[e8] = paramString;
    N[e8] = paramBoolean;
    eY[e8] = paramShort3;
    dm[e8] = paramShort4;
    d2[e8] = paramShort5;
    dQ[e8] = paramShort6;
    aR[e8] = paramShort7;
    fH[e8] = paramShort8;
    fP[e8] = paramShort9;
    eg[e8] = paramShort10;
    aP[e8] = paramByte;
    e8 = (byte)(e8 + 1);
  }
  
  public static void jdMethod_long(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort)
      {
        gd[i1] = gd[(e8 - 1)];
        m[i1] = m[(e8 - 1)];
        bb[i1] = bb[(e8 - 1)];
        N[i1] = N[(e8 - 1)];
        eY[i1] = eY[(e8 - 1)];
        dm[i1] = dm[(e8 - 1)];
        d2[i1] = d2[(e8 - 1)];
        dQ[i1] = dQ[(e8 - 1)];
        aR[i1] = aR[(e8 - 1)];
        fH[i1] = fH[(e8 - 1)];
        fP[i1] = fP[(e8 - 1)];
        eg[i1] = eg[(e8 - 1)];
        aP[i1] = aP[(e8 - 1)];
        e8 = (byte)(e8 - 1);
        return;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < e8; i2 = (byte)(i2 + 1)) {
      if ((aP[i2] == 0) && ((!paramBoolean) || (this.cZ.jdMethod_for(gd[i2])))) {
        i1 = (byte)(i1 + 1);
      }
    }
    short[] arrayOfShort1 = new short[i1];
    short[] arrayOfShort2 = new short[i1];
    String[] arrayOfString = new String[i1];
    boolean[] arrayOfBoolean = new boolean[i1];
    short[] arrayOfShort3 = new short[i1];
    short[] arrayOfShort4 = new short[i1];
    short[] arrayOfShort5 = new short[i1];
    short[] arrayOfShort6 = new short[i1];
    short[] arrayOfShort7 = new short[i1];
    short[] arrayOfShort8 = new short[i1];
    short[] arrayOfShort9 = new short[i1];
    short[] arrayOfShort10 = new short[i1];
    byte[] arrayOfByte = new byte[i1];
    byte b10 = 0;
    for (int i3 = 0; i3 < e8; i3 = (byte)(i3 + 1)) {
      if ((aP[i3] == 0) && ((!paramBoolean) || (this.cZ.jdMethod_for(gd[i3]))))
      {
        arrayOfShort1[b10] = gd[i3];
        arrayOfShort2[b10] = m[i3];
        arrayOfString[b10] = bb[i3];
        arrayOfBoolean[b10] = N[i3];
        arrayOfShort3[b10] = eY[i3];
        arrayOfShort4[b10] = dm[i3];
        arrayOfShort5[b10] = d2[i3];
        arrayOfShort6[b10] = dQ[i3];
        arrayOfShort7[b10] = aR[i3];
        arrayOfShort8[b10] = fH[i3];
        arrayOfShort9[b10] = fP[i3];
        arrayOfShort10[b10] = eg[i3];
        arrayOfByte[b10] = aP[i3];
        b10 = (byte)(b10 + 1);
      }
    }
    System.arraycopy(arrayOfShort1, 0, gd, 0, arrayOfShort1.length);
    System.arraycopy(arrayOfShort2, 0, m, 0, arrayOfShort2.length);
    System.arraycopy(arrayOfString, 0, bb, 0, arrayOfString.length);
    System.arraycopy(arrayOfBoolean, 0, N, 0, arrayOfBoolean.length);
    System.arraycopy(arrayOfShort3, 0, eY, 0, arrayOfShort3.length);
    System.arraycopy(arrayOfShort4, 0, dm, 0, arrayOfShort4.length);
    System.arraycopy(arrayOfShort5, 0, d2, 0, arrayOfShort5.length);
    System.arraycopy(arrayOfShort6, 0, dQ, 0, arrayOfShort6.length);
    System.arraycopy(arrayOfShort7, 0, aR, 0, arrayOfShort7.length);
    System.arraycopy(arrayOfShort8, 0, fH, 0, arrayOfShort8.length);
    System.arraycopy(arrayOfShort9, 0, fP, 0, arrayOfShort9.length);
    System.arraycopy(arrayOfShort10, 0, eg, 0, arrayOfShort10.length);
    System.arraycopy(arrayOfByte, 0, aP, 0, arrayOfByte.length);
    e8 = b10;
  }
  
  public static short J(short paramShort)
  {
    if (paramShort < 3840) {
      return paramShort;
    }
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return m[i1];
      }
    }
    return -1;
  }
  
  public static String l(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return bb[i1];
      }
    }
    return "";
  }
  
  public static short jdMethod_null(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return eY[i1];
      }
    }
    return 0;
  }
  
  public static short g(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return dm[i1];
      }
    }
    return 0;
  }
  
  public static short E(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return d2[i1];
      }
    }
    return 0;
  }
  
  public static short C(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return dQ[i1];
      }
    }
    return 0;
  }
  
  public static short p(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return aR[i1];
      }
    }
    return 0;
  }
  
  public static short f(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return fP[i1];
      }
    }
    return 0;
  }
  
  public static short t(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return eg[i1];
      }
    }
    return 0;
  }
  
  public static short n(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return fH[i1];
      }
    }
    return 0;
  }
  
  public static byte m(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return aP[i1];
      }
    }
    return 0;
  }
  
  public static boolean e(short paramShort)
  {
    for (int i1 = 0; i1 < e8; i1 = (byte)(i1 + 1)) {
      if (gd[i1] == paramShort) {
        return N[i1];
      }
    }
    return false;
  }
  
  public void H()
  {
    synchronized (bG)
    {
      bN = 0;
    }
  }
  
  public boolean a(String paramString, short paramShort1, byte paramByte1, byte paramByte2, short paramShort2, byte paramByte3)
  {
    if (bN >= y) {
      return false;
    }
    synchronized (bG)
    {
      bG[bN] = paramString;
      ds[bN] = paramShort1;
      ej[bN] = paramByte1;
      cy[bN] = paramByte2;
      ec[bN] = paramShort2;
      aa[bN] = paramByte3;
      bN = (byte)(bN + 1);
    }
    return true;
  }
  
  public boolean jdMethod_goto()
  {
    return bN > 0;
  }
  
  public void jdMethod_int()
  {
    if (bN <= 0) {
      return;
    }
    synchronized (bG)
    {
      bG[0] = bG[(bN - 1)];
      ds[0] = ds[(bN - 1)];
      ej[0] = ej[(bN - 1)];
      cy[0] = cy[(bN - 1)];
      ec[0] = ec[(bN - 1)];
      aa[0] = aa[(bN - 1)];
      bN = (byte)(bN - 1);
    }
  }
  
  public void A()
  {
    synchronized (co)
    {
      ca = 0;
    }
  }
  
  public boolean I()
  {
    return ca > 0;
  }
  
  public boolean a(short paramShort1, String paramString, byte paramByte1, byte paramByte2, short paramShort2, byte paramByte3, byte paramByte4, int paramInt, boolean paramBoolean1, byte paramByte5, boolean paramBoolean2, short[] paramArrayOfShort, short paramShort3, short paramShort4, byte paramByte6, boolean paramBoolean3, boolean paramBoolean4, byte paramByte7, byte paramByte8, byte paramByte9)
  {
    if (ca >= 25) {
      return false;
    }
    synchronized (co)
    {
      aE[ca] = paramShort1;
      co[ca] = paramString;
      f2[ca] = paramByte1;
      c5[ca] = paramByte2;
      k[ca] = paramShort2;
      dN[ca] = paramByte3;
      eG[ca] = paramByte4;
      ed[ca] = paramInt;
      cj[ca] = paramBoolean1;
      fB[ca] = paramByte5;
      dB[ca] = paramBoolean2;
      dP[ca] = paramArrayOfShort;
      char[ca] = paramShort3;
      byte[ca] = paramShort4;
      bk[ca] = paramByte6;
      fx[ca] = paramBoolean3;
      df[ca] = paramBoolean4;
      bA[ca] = paramByte7;
      cF[ca] = paramByte8;
      cE[ca] = paramByte9;
      ca = (byte)(ca + 1);
    }
    return true;
  }
  
  public void m()
  {
    if (ca <= 0) {
      return;
    }
    synchronized (co)
    {
      aE[0] = aE[(ca - 1)];
      co[0] = co[(ca - 1)];
      f2[0] = f2[(ca - 1)];
      c5[0] = c5[(ca - 1)];
      bA[0] = bA[(ca - 1)];
      cF[0] = cF[(ca - 1)];
      fx[0] = fx[(ca - 1)];
      df[0] = df[(ca - 1)];
      k[0] = k[(ca - 1)];
      dN[0] = dN[(ca - 1)];
      bk[0] = bk[(ca - 1)];
      eG[0] = eG[(ca - 1)];
      ed[0] = ed[(ca - 1)];
      cj[0] = cj[(ca - 1)];
      fB[0] = fB[(ca - 1)];
      dB[0] = dB[(ca - 1)];
      dP[0] = dP[(ca - 1)];
      char[0] = char[(ca - 1)];
      byte[0] = byte[(ca - 1)];
      ca = (byte)(ca - 1);
    }
  }
  
  public void run()
  {
    HttpConnection localHttpConnection = null;
    DataOutputStream localDataOutputStream = null;
    DataInputStream localDataInputStream = null;
    try
    {
      if (this.fQ > 0)
      {
        switch (this.ef)
        {
        case 0: 
          localHttpConnection = (HttpConnection)Connector.open("http://10.0.0.172:80/a", 3);
          localHttpConnection.setRequestProperty("X-Online-Host", fN[this.fA]);
          break;
        case 1: 
        case 2: 
          localHttpConnection = (HttpConnection)Connector.open("http://" + fN[this.fA] + "/a", 3);
        }
        byte[] arrayOfByte1 = new byte[8];
        System.arraycopy(eE, 0, arrayOfByte1, 0, eE.length);
        arrayOfByte1[7] = this.fQ;
        int i1 = q.a(arrayOfByte1, 0, arrayOfByte1.length);
        localHttpConnection.setRequestMethod("POST");
        localDataOutputStream = localHttpConnection.openDataOutputStream();
        localDataOutputStream.write(q.aD);
        localDataOutputStream.writeInt(i1);
        localDataOutputStream.writeShort(20);
        localDataOutputStream.writeInt(q.cB);
        localDataOutputStream.writeLong(this.aG.bQ);
        localDataOutputStream.write(arrayOfByte1);
        localDataOutputStream.close();
        int i2 = (int)localHttpConnection.getLength();
        if (i2 > 0)
        {
          localDataInputStream = localHttpConnection.openDataInputStream();
          byte[] arrayOfByte2 = new byte[i2];
          localDataInputStream.readFully(arrayOfByte2);
          localDataInputStream.close();
          if (this.aG.a(arrayOfByte2)) {
            jdMethod_if(arrayOfByte2);
          }
          arrayOfByte2 = null;
        }
      }
    }
    catch (Exception localException) {}finally
    {
      localDataOutputStream = null;
      localDataInputStream = null;
      localHttpConnection = null;
    }
  }
  
  public static boolean M(short paramShort)
  {
    return (paramShort & 0x80) > 0;
  }
  
  public static boolean u(short paramShort)
  {
    return (paramShort & 0x40) > 0;
  }
  
  public static boolean y(short paramShort)
  {
    return (paramShort & 0x20) > 0;
  }
  
  public static boolean H(short paramShort)
  {
    return (paramShort & 0x10) > 0;
  }
  
  public static boolean jdMethod_case(short paramShort)
  {
    return (paramShort & 0x8) > 0;
  }
  
  public static boolean B(short paramShort)
  {
    if (jdMethod_case(paramShort)) {
      return (paramShort & 0x400) > 0;
    }
    return false;
  }
  
  public static boolean I(short paramShort)
  {
    return (paramShort & 0x800) > 0;
  }
  
  public static byte h(short paramShort)
  {
    return (byte)(paramShort & 0x7);
  }
  
  public static boolean D(short paramShort)
  {
    return (paramShort & 0x100) > 0;
  }
  
  public static boolean jdMethod_new(short paramShort)
  {
    return (paramShort & 0x200) > 0;
  }
  
  public void a(int paramInt, String paramString, byte paramByte1, byte paramByte2, short paramShort)
  {
    this.cJ.lC[paramInt] = true;
    this.cJ.h4[paramInt] += 1;
    if (this.cJ.h4[paramInt] > 25)
    {
      System.arraycopy(this.cJ.ld[paramInt], 1, this.cJ.ld[paramInt], 0, this.cJ.ld[paramInt].length - 1);
      for (int i1 = 0; i1 < 3; i1 = (byte)(i1 + 1)) {
        System.arraycopy(this.cJ.g2[paramInt][i1], 1, this.cJ.g2[paramInt][i1], 0, this.cJ.g2[paramInt][i1].length - 1);
      }
      this.cJ.h4[paramInt] = 25;
      if (((this.cJ.jdField_do == 15) || (this.cJ.jdField_do == 89) || (this.cJ.jdField_do == 91) || (this.cJ.jdField_do == 86)) && (paramInt == this.cJ.md.jdField_char))
      {
        ae tmp235_232 = this.cJ.md;
        tmp235_232.l = ((byte)(tmp235_232.l - 1));
        if (this.cJ.md.l < this.cJ.md.g)
        {
          ae tmp275_272 = this.cJ.md;
          tmp275_272.g = ((byte)(tmp275_272.g - 1));
          if (this.cJ.md.g < 0) {
            this.cJ.md.g = 0;
          }
          this.cJ.md.l = this.cJ.md.g;
          this.cJ.md.jdField_do = ((byte)Math.min(this.cJ.h4[paramInt] - 1, this.cJ.md.g + this.cJ.md.jdField_else - 1));
        }
      }
    }
    if (this.cJ.h4[paramInt] == 1)
    {
      this.cJ.ld[paramInt][(this.cJ.h4[paramInt] - 1)] = paramString;
      this.cJ.g2[paramInt][0][(this.cJ.h4[paramInt] - 1)] = ((short)paramByte2);
      this.cJ.g2[paramInt][1][(this.cJ.h4[paramInt] - 1)] = ((short)paramByte1);
      this.cJ.g2[paramInt][2][(this.cJ.h4[paramInt] - 1)] = paramShort;
    }
    else if (this.cJ.ld[paramInt][(this.cJ.h4[paramInt] - 2)] == null)
    {
      this.cJ.ld[paramInt][(this.cJ.h4[paramInt] - 2)] = paramString;
      this.cJ.g2[paramInt][0][(this.cJ.h4[paramInt] - 2)] = ((short)paramByte2);
      this.cJ.g2[paramInt][1][(this.cJ.h4[paramInt] - 2)] = ((short)paramByte1);
      this.cJ.g2[paramInt][2][(this.cJ.h4[paramInt] - 2)] = paramShort;
      this.cJ.h4[paramInt] -= 1;
    }
    else
    {
      this.cJ.ld[paramInt][(this.cJ.h4[paramInt] - 1)] = paramString;
      this.cJ.g2[paramInt][0][(this.cJ.h4[paramInt] - 1)] = ((short)paramByte2);
      this.cJ.g2[paramInt][1][(this.cJ.h4[paramInt] - 1)] = ((short)paramByte1);
      this.cJ.g2[paramInt][2][(this.cJ.h4[paramInt] - 1)] = paramShort;
    }
  }
  
  public boolean w()
  {
    boolean bool = false;
    for (int i1 = 0; i1 < this.cJ.li.length; i1 = (byte)(i1 + 1)) {
      if (this.cJ.li[i1].gq) {
        bool = true;
      }
    }
    return bool;
  }
  
  public void jdMethod_if(String paramString, short paramShort1, byte paramByte1, byte paramByte2, short paramShort2, byte paramByte3)
  {
    if (this.cv == 2)
    {
      ar localar = jdMethod_goto(paramShort1);
      if ((localar != null) && (localar.a(this.cZ)))
      {
        bool1 = false;
        b10 = 0;
        byte b11 = 0;
        b12 = 0;
        switch (paramByte1)
        {
        case 7: 
          b10 = 1;
          b11 = 0;
          bool1 = false;
          b12 = 55;
          break;
        case 6: 
          b10 = 3;
          b11 = 0;
          bool1 = false;
          b12 = 56;
          break;
        case 4: 
          b10 = 0;
          b11 = 0;
          bool1 = true;
          b12 = 55;
          break;
        case 3: 
          b10 = 3;
          bool1 = false;
          b11 = 0;
          b12 = 56;
          break;
        case 2: 
          bool1 = i(paramByte2);
          b10 = jdMethod_case(paramByte2);
          b11 = m(paramByte2);
          b12 = 56;
        }
        localar.a(null, paramByte1, paramByte2, b10, b11, b12, paramShort2, bool1);
      }
      return;
    }
    int i1 = 0;
    boolean bool1 = false;
    byte b10 = 0;
    short[] arrayOfShort = new short[8];
    byte b12 = 0;
    int i2 = -1;
    byte b13 = -1;
    boolean bool2 = false;
    boolean bool3 = false;
    int i3 = 0;
    int i4 = 0;
    byte b14 = 0;
    byte b15 = 0;
    byte b16 = 0;
    boolean bool4 = false;
    boolean bool5 = false;
    byte b17 = -1;
    String str = null;
    int i5;
    short s1;
    short s2;
    int i6;
    synchronized (this.cJ.mX)
    {
      for (i5 = 0; i5 < this.cJ.kT; i5 = (short)(i5 + 1)) {
        if (((g.dD == 2) && (g.dZ == 1)) || ((this.cJ.iy[i5].equals(paramString)) && (!jdMethod_case(this.cJ.dq[i5])) && (this.cJ.mX[i5] < ag.hF + dU) && (this.cJ.mX[i5] + 20 > ag.hF) && (this.cJ.mW[i5] < ag.hE + fp) && (this.cJ.mW[i5] + 31 > ag.hE) && (this.cJ.iy[i5].equals(paramString)) && (!jdMethod_case(this.cJ.dq[i5])) && (!D(this.cJ.dq[i5])) && (!jdMethod_new(this.cJ.dq[i5]))))
        {
          i1 = 1;
          s1 = this.cJ.mX[i5];
          s2 = this.cJ.mW[i5];
          b12 = this.cJ.eX[i5];
          i2 = this.cJ.mL[i5];
          b13 = this.cJ.k7[i5];
          i3 = this.cJ.gT[i5];
          i4 = this.cJ.k9[i5];
          b14 = this.cJ.jn[i5];
          b15 = this.cJ.jm[i5];
          b16 = this.cJ.hQ[i5];
          bool3 = H(this.cJ.dq[i5]);
          bool4 = u(this.cJ.dq[i5]);
          bool2 = I(this.cJ.dq[i5]);
          b17 = this.cJ.gh[i5];
          str = this.cJ.fy[i5];
          for (i6 = 0; i6 < arrayOfShort.length; i6 = (byte)(i6 + 1)) {
            arrayOfShort[i6] = this.cJ.jC[i5][i6];
          }
          bool5 = a(paramString);
          break;
        }
      }
    }
    if (i1 == 0) {
      return;
    }
    ??? = jdMethod_goto(paramShort1);
    if (??? != null)
    {
      i5 = 0;
      i6 = -1;
      for (int i7 = 0; i7 < this.cJ.li.length; i7 = (byte)(i7 + 1))
      {
        if ((!this.cJ.li[i7].gq) && (this.cJ.li[i7].O.equals(paramString)))
        {
          i5 = 1;
          break;
        }
        if (this.cJ.li[i7].gq)
        {
          i6 = i7;
          break;
        }
      }
      if ((i5 == 0) && (i6 != -1))
      {
        if ((this.cJ.hD != null) && (this.cJ.bD != null) && (paramString.equals(this.cJ.hD)))
        {
          this.cJ.bD.a((byte)1, paramShort1, null, paramByte1, paramByte2, paramShort2, (byte)-1);
          jdMethod_int();
          return;
        }
        this.cJ.li[i6].hd = 0;
        this.cJ.li[i6].O = paramString;
        this.cJ.li[i6].gD = b12;
        this.cJ.li[i6].bo = paramByte3;
        this.cJ.li[i6].fa = i3;
        this.cJ.li[i6].g4 = i4;
        this.cJ.li[i6].hP = b14;
        this.cJ.li[i6].hO = b15;
        a(this.cJ.li[i6], b16);
        this.cJ.li[i6].fL = i2;
        this.cJ.li[i6].fx = jdMethod_try(i2);
        this.cJ.li[i6].es = jdMethod_if(i2);
        this.cJ.li[i6].fj = b13;
        this.cJ.li[i6].dU = bool3;
        this.cJ.li[i6].fi = bool2;
        if (bool3) {
          this.cJ.li[i6].gE = true;
        }
        this.cJ.li[i6].eN = b17;
        this.cJ.li[i6].eB = str;
        this.cJ.li[i6].he = bool4;
        this.cJ.li[i6].gO = paramByte1;
        this.cJ.li[i6].fq = paramByte2;
        this.cJ.li[i6].f0 = paramShort2;
        this.cJ.li[i6].h2 = ((a3)???);
        this.cJ.li[i6].aP = s1;
        this.cJ.li[i6].aM = s2;
        this.cJ.li[i6].a7 = arrayOfShort;
        int[] arrayOfInt = new int[a.ad];
        for (int i8 = 0; i8 < arrayOfShort.length; i8 = (byte)(i8 + 1)) {
          arrayOfInt[i8] = a3.a(arrayOfShort[i8], a.C);
        }
        this.cJ.li[i6].H = arrayOfInt;
        this.cJ.li[i6].gq = false;
        this.cJ.li[i6].N();
        this.cJ.li[i6].T = false;
        this.cJ.li[i6].ao = false;
        this.cJ.li[i6].hU = false;
        this.cJ.li[i6].gQ = bool5;
        this.cJ.li[i6].h4 = false;
        this.cJ.li[i6].gk = false;
        if ((this.cJ.hD != null) && (this.cJ.hD.equals(this.cJ.li[i6].O))) {
          this.cJ.li[i6].gk = true;
        }
        this.cJ.li[i6].a4 = 0;
      }
    }
  }
  
  public void d()
  {
    if ((aE[0] != this.cJ.jdField_if) || (this.cZ.a8) || (this.cZ.jdMethod_else()))
    {
      m();
      return;
    }
    if ((this.cJ.hD != null) && (this.cJ.bD != null) && (co[0].equals(this.cJ.hD)))
    {
      this.cJ.bD.a((byte)0, (short)-1, this.cZ.O, f2[0], c5[0], k[0], bk[0]);
      m();
      return;
    }
    int i1 = 0;
    int i2 = -1;
    for (int i3 = 0; i3 < this.cJ.li.length; i3 = (byte)(i3 + 1))
    {
      if ((!this.cJ.li[i3].gq) && (this.cJ.li[i3].O.equals(co[0])))
      {
        i1 = 1;
        break;
      }
      if (this.cJ.li[i3].gq)
      {
        i2 = i3;
        break;
      }
    }
    if ((i1 == 0) && (i2 != -1))
    {
      this.cJ.li[i2].hd = 0;
      this.cJ.li[i2].O = co[0];
      this.cJ.li[i2].gD = eG[0];
      this.cJ.li[i2].bo = dN[0];
      this.cJ.li[i2].fL = ed[0];
      this.cJ.li[i2].fx = jdMethod_try(ed[0]);
      this.cJ.li[i2].es = jdMethod_if(ed[0]);
      this.cJ.li[i2].fj = fB[0];
      this.cJ.li[i2].dU = cj[0];
      if (this.cJ.li[i2].dU) {
        this.cJ.li[i2].gE = true;
      }
      this.cJ.li[i2].he = dB[0];
      this.cJ.li[i2].fa = fx[0];
      this.cJ.li[i2].g4 = df[0];
      this.cJ.li[i2].hP = cF[0];
      this.cJ.li[i2].hO = cE[0];
      a(this.cJ.li[i2], bA[0]);
      this.cJ.li[i2].gO = f2[0];
      this.cJ.li[i2].fq = c5[0];
      this.cJ.li[i2].f0 = k[0];
      this.cJ.li[i2].hg = bk[0];
      this.cJ.li[i2].h2 = this.cZ;
      this.cJ.li[i2].gQ = a(this.cJ.li[i2].O);
      this.cJ.li[i2].h4 = false;
      this.cJ.li[i2].gk = false;
      if ((this.cJ.hD != null) && (this.cJ.hD.equals(this.cJ.li[i2].O))) {
        this.cJ.li[i2].gk = true;
      }
      this.cJ.li[i2].eN = -1;
      this.cJ.li[i2].eB = null;
      i3 = 0;
      for (int i4 = 0; i4 < this.cJ.kT; i4 = (byte)(i4 + 1)) {
        if (this.cJ.iy[i4].equals(this.cJ.li[i2].O))
        {
          this.cJ.li[i2].aP = this.cJ.mX[i4];
          this.cJ.li[i2].aM = this.cJ.mW[i4];
          this.cJ.li[i2].eN = this.cJ.gh[i4];
          this.cJ.li[i2].eB = this.cJ.fy[i4];
          i3 = 1;
        }
      }
      if (i3 == 0)
      {
        this.cJ.li[i2].aP = char[0];
        this.cJ.li[i2].aM = byte[0];
      }
      this.cJ.li[i2].a7 = dP[0];
      int[] arrayOfInt = new int[a.ad];
      for (int i5 = 0; i5 < dP[0].length; i5 = (byte)(i5 + 1)) {
        arrayOfInt[i5] = a3.a(dP[0][i5], a.C);
      }
      this.cJ.li[i2].H = arrayOfInt;
      this.cJ.li[i2].gq = false;
      this.cJ.li[i2].N();
      this.cJ.li[i2].T = false;
      this.cJ.li[i2].ao = false;
      this.cJ.li[i2].hU = false;
      this.cJ.li[i2].a4 = 0;
      m();
    }
  }
  
  public ar jdMethod_goto(short paramShort)
  {
    for (int i1 = g.jS.length - 1; i1 >= 0; i1--) {
      if ((g.jS[i1].t == paramShort) && (g.jS[i1].a((byte)16) > 0) && (g.jS[i1].aP > ag.hF) && (g.jS[i1].aM > ag.hE) && (g.jS[i1].aP + g.jS[i1].aK < ag.hF + dU) && (g.jS[i1].aM + g.jS[i1].bA < ag.hE + fp)) {
        return g.jS[i1];
      }
    }
    return null;
  }
  
  public void jdMethod_byte(DataInputStream paramDataInputStream)
  {
    if (this.cJ.jl) {
      try
      {
        if ((paramDataInputStream != null) && (this.cJ.jdField_if > 3)) {
          paramDataInputStream.readShort();
        }
        if (!this.cJ.mY) {
          this.aH[0] = jdMethod_do(e(this.cH[this.cJ.jdField_if]));
        } else {
          this.aH[0] = jdMethod_goto(this.cH[this.cJ.jdField_if] + ".yy");
        }
      }
      catch (Exception localException1) {}
    } else {
      try
      {
        int i1 = paramDataInputStream.readShort();
        byte[] arrayOfByte = new byte[i1];
        paramDataInputStream.readFully(arrayOfByte, 0, i1);
        this.aH[0] = jdMethod_do(arrayOfByte);
        arrayOfByte = null;
      }
      catch (Exception localException2) {}
    }
  }
  
  public void jdMethod_goto(DataInputStream paramDataInputStream)
  {
    try
    {
      if ((paramDataInputStream != null) && (paramDataInputStream.readShort() == 0))
      {
        this.d7 = false;
        paramDataInputStream = null;
        return;
      }
      jdMethod_byte(paramDataInputStream);
      byte[] arrayOfByte1 = null;
      if ((this.cJ.jdField_if > 3) && (!this.cJ.bo) && (!this.cJ.l0)) {
        try
        {
          arrayOfByte1 = new byte[paramDataInputStream.available()];
          paramDataInputStream.readFully(arrayOfByte1);
          int i1 = a(arrayOfByte1, jdMethod_else(this.cJ.jdField_if));
          if (i1 != -1)
          {
            i3 = q.a(arrayOfByte1, 0, arrayOfByte1.length);
            a((short)i1, this.cJ.jdField_if, (short)this.d8[this.cJ.jdField_if], i3);
          }
          paramDataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte1));
          arrayOfByte1 = null;
        }
        catch (Exception localException2) {}
      }
      Object localObject;
      if (this.cJ.bo)
      {
        if (paramDataInputStream != null) {
          paramDataInputStream.close();
        }
        paramDataInputStream = null;
        localObject = new ByteArrayInputStream(this.cJ.lR);
        paramDataInputStream = new DataInputStream((InputStream)localObject);
      }
      else if (this.cJ.l0)
      {
        localObject = new DataInputStream(getClass().getResourceAsStream("/local/scene" + this.cJ.jdField_if + "_" + "high" + ".local"));
        ((DataInputStream)localObject).skip(2L);
        jdMethod_else((DataInputStream)localObject);
        jdMethod_case((DataInputStream)localObject);
        jdMethod_do((DataInputStream)localObject);
        ((DataInputStream)localObject).close();
        localObject = null;
      }
      if (!this.cJ.l0)
      {
        jdMethod_else(paramDataInputStream);
        jdMethod_case(paramDataInputStream);
        jdMethod_do(paramDataInputStream);
      }
      int i2 = paramDataInputStream.readByte();
      int i5;
      if (i2 > 0)
      {
        i3 = paramDataInputStream.readShort();
        this.cJ.mN = new l[i3];
        l locall = null;
        for (i5 = 0; i5 < i3; i5++)
        {
          locall = null;
          locall = new l();
          locall.jdField_if = paramDataInputStream.readUTF();
          locall.jdField_try = paramDataInputStream.readShort();
          locall.jdField_do = paramDataInputStream.readByte();
          locall.jdField_new = paramDataInputStream.readShort();
          locall.jdField_int = (paramDataInputStream.readByte() == 0);
          locall.a = new int[5];
          locall.a[1] = -1;
          this.bV.a(locall.jdField_do, 0, locall.a);
          this.cJ.mN[i5] = locall;
        }
      }
      int i3 = paramDataInputStream.readByte();
      for (int i4 = 0; i4 < i3; i4 = (byte)(i4 + 1))
      {
        ar.ce[i4] = paramDataInputStream.readShort();
        ar.cx[i4] = paramDataInputStream.readUTF();
        ar.cL[i4] = paramDataInputStream.readByte();
        ar.cA[i4] = paramDataInputStream.readInt();
        ar.co[i4] = paramDataInputStream.readInt();
        ar.b6[i4] = paramDataInputStream.readShort();
        ar.cQ[i4] = paramDataInputStream.readShort();
        ar.b4[i4] = paramDataInputStream.readShort();
        ar.cO[i4] = paramDataInputStream.readShort();
        ar.cu[i4] = paramDataInputStream.readByte();
        ar.bU[i4][0] = paramDataInputStream.readByte();
        ar.bU[i4][1] = paramDataInputStream.readByte();
        ar.cs[i4] = paramDataInputStream.readByte();
        ar.bS[i4][0] = paramDataInputStream.readByte();
        ar.bS[i4][1] = paramDataInputStream.readByte();
        ar.cr[i4] = paramDataInputStream.readByte();
        ar.bQ[i4][0] = paramDataInputStream.readByte();
        ar.bQ[i4][1] = paramDataInputStream.readByte();
        ar.cJ[i4] = paramDataInputStream.readByte();
        ar.bW[i4] = paramDataInputStream.readByte();
        ar.dl[i4] = paramDataInputStream.readByte();
        ar.c7[i4] = paramDataInputStream.readByte();
        ar.c1[i4] = paramDataInputStream.readByte();
        ar.ct[i4] = paramDataInputStream.readByte();
        ar.cN[i4] = paramDataInputStream.readByte();
        ar.cq[i4] = paramDataInputStream.readByte();
        ar.c4[i4] = paramDataInputStream.readByte();
        for (i5 = 0; i5 < this.bR.d.size(); i5 = (byte)(i5 + 1))
        {
          ao localao1 = (ao)this.bR.d.elementAt(i5);
          if ((localao1.P == 9) && (localao1.jdField_for[0] == ar.ce[i4]) && (localao1.E == 8888))
          {
            i7 = (byte)(this.cZ.a((byte)14) - ar.cL[i4]);
            i7 = (byte)Math.max(i7, 0);
            ar.co[i4] = ((ar.co[i4] + i7 * a.a) * a.void);
            ar.b6[i4] = ((short)((ar.b6[i4] + i7 * a.ad) * a.t));
            ar.cQ[i4] = ((short)((ar.cQ[i4] + i7 * a.ad) * a.t));
            ar.b4[i4] = ((short)((ar.b4[i4] + i7 * a.ad) * a.t));
            ar.cO[i4] = ((short)((ar.cO[i4] + i7 * a.J) * a.t));
            break;
          }
        }
      }
      int i6 = paramDataInputStream.readByte();
      this.S.aJ = new byte[i6][];
      for (int i7 = 0; i7 < i6; i7++)
      {
        i5 = paramDataInputStream.readShort();
        byte[] arrayOfByte2 = new byte[i5];
        paramDataInputStream.readFully(arrayOfByte2, 0, arrayOfByte2.length);
        this.S.aJ[i7] = arrayOfByte2;
        arrayOfByte2 = null;
      }
      if (this.bR == null) {
        this.bR = new ak(this);
      }
      this.bR.jdMethod_for();
      i7 = paramDataInputStream.readByte();
      ao localao2;
      for (int i8 = 0; i8 < i7; i8++)
      {
        paramDataInputStream.readShort();
        localao2 = new ao(paramDataInputStream);
        this.bR.a(localao2);
        localao2 = null;
      }
      if (this.cJ.li == null) {
        this.cJ.li = new ag[5];
      }
      for (i8 = 0; i8 < this.cJ.li.length; i8 = (byte)(i8 + 1))
      {
        if (this.cJ.li[i8] == null)
        {
          this.cJ.li[i8] = new ag(this);
          this.cJ.li[i8].jdMethod_if(this.b0);
        }
        this.cJ.li[i8].gq = true;
        this.cJ.li[i8].eN = -1;
        this.cJ.li[i8].eB = null;
      }
      this.cZ.a(this.b0);
      this.cZ.jdMethod_if(this.b0);
      B();
      ar.k();
      if ((!this.cZ.gE) && (g.dZ == 1)) {
        this.fU = 0;
      }
      if (this.fU > 0)
      {
        this.fU = ((short)(this.fU + 2));
        this.cJ.jdMethod_null();
        if ((g.dD == 2) && (g.dZ == 1) && (this.cZ.gE)) {
          for (i8 = 0; i8 < this.bR.d.size(); i8 = (byte)(i8 + 1))
          {
            localao2 = (ao)this.bR.d.elementAt(i8);
            if ((localao2.P == 4) && (localao2.jdField_for[0] == g.jS[0].t) && (this.dV != null))
            {
              for (int i9 = 0; i9 < this.dV.length; i9 = (byte)(i9 + 1))
              {
                g.jS[i9].jdMethod_if((byte)16, this.dV[i9]);
                if (this.dV[i9] == 0) {
                  g.jS[i9].cf = true;
                }
              }
              break;
            }
          }
        }
      }
      else
      {
        g.jS = null;
      }
      H();
      if ((g.dD != 1) || (g.dZ != 0))
      {
        this.cJ.kg = -1;
        this.cJ.hD = null;
        this.cJ.bD = null;
      }
      if ((g.dD == 4) && (this.cZ.fL >= 0) && (this.aG.jdMethod_int(3756)))
      {
        this.aG.jdMethod_new(this.cJ.jdField_if);
        this.aG.jdMethod_if();
      }
      this.cJ.jdField_for = true;
    }
    catch (Exception localException1)
    {
      localException1.printStackTrace();
    }
  }
  
  public void j()
  {
    try
    {
      this.aH[7] = Image.createImage("/head.png");
      this.aH[11] = Image.createImage("/combo.png");
      this.aH[8] = Image.createImage("/face.png");
      this.aH[3] = Image.createImage("/cursor.png");
      P();
      this.aH[12] = Image.createImage("/word2.png");
      this.aH[10] = Image.createImage("/equips.png");
      this.aH[5] = Image.createImage("/number.png");
      this.aH[6] = Image.createImage("/pointer.png");
      this.aH[2] = Image.createImage("/frame.png");
      this.aH[4] = Image.createImage("/arrow.png");
      this.aH[13] = Image.createImage("/sale.png");
      this.aH[9] = Image.createImage("/trans.png");
      this.af = jdMethod_goto("/map/10.yy");
      this.eZ = Image.createImage("/otherplayer.png");
      this.fz = Image.createImage("/magic.png");
      this.jdField_goto = jdMethod_goto("/map/06.yy");
      this.cm = jdMethod_goto("/map/04.yy");
      this.b5 = jdMethod_goto("/map/08.yy");
      this.fn = jdMethod_goto("/map/01.yy");
      this.gc = jdMethod_goto("/map/07.yy");
      this.cq = jdMethod_goto("/map/05.yy");
      this.eD = jdMethod_goto("/map/09.yy");
    }
    catch (Exception localException) {}
  }
  
  public void a(a3 parama3, String paramString)
  {
    int i1 = 0;
    for (int i2 = 0; i2 < this.cJ.fC; i2 = (byte)(i2 + 1)) {
      if (this.cJ.hJ[i2].equals(paramString))
      {
        this.cJ.cI[i2] = 600;
        i1 = 1;
        break;
      }
    }
    if (i1 == 0)
    {
      if (this.cJ.fC >= 5) {
        this.cJ.fC = ((byte)(5 - 1));
      }
      this.cJ.hJ[this.cJ.fC] = paramString;
      this.cJ.cI[this.cJ.fC] = 600;
      g tmp136_133 = this.cJ;
      tmp136_133.fC = ((byte)(tmp136_133.fC + 1));
    }
    if ((this.cZ.he) && ((this.cJ.hD == null) || ((this.cJ.hD != null) && (this.cJ.bD != null) && (!this.cJ.hD.equals(paramString))))) {
      for (i2 = 0; i2 < this.cJ.kT; i2 = (byte)(i2 + 1)) {
        if (this.cJ.iy[i2].equals(paramString))
        {
          if (!M(this.cJ.dq[i2])) {
            return;
          }
          if (D(this.cJ.dq[i2])) {
            return;
          }
          if (1 == h(this.cJ.dq[i2])) {
            return;
          }
          this.cJ.kg = this.cJ.co[i2];
          this.cJ.hD = paramString;
          this.cJ.gj = null;
          this.cJ.hc = null;
          for (int i3 = 0; i3 < this.cJ.li.length; i3 = (byte)(i3 + 1)) {
            if ((!this.cJ.li[i3].gq) && (this.cJ.li[i3].O.equals(this.cJ.hD)))
            {
              this.cJ.li[i3].gq = true;
              break;
            }
          }
          this.cJ.bD = null;
          this.cJ.bD = new ag(this);
          this.cJ.bD.jdMethod_if(this.b0);
          this.cJ.bD.O = this.cJ.hD;
          this.cJ.bD.fp = 0;
          this.cJ.bD.T = false;
          this.cJ.bD.ao = false;
          this.cJ.bD.hU = false;
          this.cJ.bD.a4 = 0;
          this.cJ.bD.jdMethod_void(this.cJ.eX[i2]);
          this.cJ.bD.m(this.cJ.kf[i2]);
          this.cJ.bD.fa = this.cJ.gT[i2];
          this.cJ.bD.aP = parama3.aP;
          this.cJ.bD.aM = parama3.aM;
          this.cJ.bD.dT = parama3.aP;
          this.cJ.bD.dS = parama3.aM;
          this.cJ.bD.g((byte)0);
          this.cJ.bD.eP = null;
          this.cJ.bD.eN = this.cJ.gh[i2];
          this.cJ.bD.fL = this.cJ.mL[i2];
          this.cJ.bD.es = jdMethod_if(this.cJ.mL[i2]);
          this.cJ.bD.fx = jdMethod_try(this.cJ.mL[i2]);
          this.cJ.bD.eB = this.cJ.fy[i2];
          this.cJ.bD.X();
          this.cJ.bD.he = u(this.cJ.dq[i2]);
          this.cJ.bD.gQ = true;
          this.cJ.bD.gk = true;
          this.cJ.bD.h4 = jdMethod_new(this.cJ.dq[i2]);
          for (i3 = 0; i3 < 8; i3 = (byte)(i3 + 1)) {
            this.cJ.bD.a7[i3] = this.cJ.jC[i2][i3];
          }
          this.cJ.bD.jdMethod_if((byte)14, this.cJ.iD[i2]);
          this.cJ.bD.jdMethod_if((byte)16, this.cJ.fz[i2]);
          this.cJ.bD.jdMethod_if((byte)20, this.cJ.g5[i2]);
          this.cJ.bD.jdMethod_if((byte)28, this.cJ.kA[i2]);
          this.cJ.bD.jdMethod_if((byte)30, this.cJ.dX[i2]);
          this.cJ.bD.jdMethod_if((byte)32, this.cJ.fi[i2]);
          this.cJ.bD.jdMethod_if((byte)34, this.cJ.kJ[i2]);
          this.cJ.bD.hv = this.cJ.en[i2];
          this.cJ.bD.hP = this.cJ.jn[i2];
          this.cJ.bD.hO = this.cJ.jm[i2];
          this.cJ.bD.g4 = this.cJ.k9[i2];
          a(this.cJ.bD, this.cJ.hQ[i2]);
          this.cJ.bD.g((byte)0);
        }
      }
    }
  }
  
  public void a(ag paramag, byte paramByte)
  {
    int i1 = paramag.a((byte)12);
    i1 = 0;
    paramag.jdMethod_if((byte)12, i1);
    paramag.hv = ((paramByte & 0x1) > 0);
    paramag.a((byte)0, (paramByte & 0x2) > 0);
    paramag.a((byte)1, (paramByte & 0x4) > 0);
    paramag.a((byte)2, (paramByte & 0x8) > 0);
    paramag.a((byte)7, (paramByte & 0x10) > 0);
  }
  
  public boolean a(String paramString)
  {
    for (int i1 = 0; i1 < this.cJ.fC; i1 = (byte)(i1 + 1)) {
      if (this.cJ.hJ[i1].equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public void r()
  {
    for (int i1 = 0; i1 < this.cJ.fC; i1 = (byte)(i1 + 1))
    {
      int tmp21_20 = i1;
      short[] tmp21_17 = this.cJ.cI;
      tmp21_17[tmp21_20] = ((short)(tmp21_17[tmp21_20] - 1));
      if (this.cJ.cI[i1] < 0)
      {
        this.cJ.hJ[i1] = this.cJ.hJ[(this.cJ.fC - 1)];
        this.cJ.cI[i1] = this.cJ.cI[(this.cJ.fC - 1)];
        g tmp95_92 = this.cJ;
        tmp95_92.fC = ((byte)(tmp95_92.fC - 1));
      }
    }
  }
  
  public void k()
  {
    this.eC = false;
    if ((this.L == null) && (!this.cJ.mB.isEmpty()))
    {
      synchronized (this.cJ.mB)
      {
        String str1 = (String)this.cJ.mB.elementAt(0);
        this.cJ.mB.removeElementAt(0);
        String str2 = jdMethod_null(str1);
        if (str2.length() > 0)
        {
          this.ao = jdMethod_else(str1);
          if (this.ao) {
            this.jdField_new = ((short)dA.stringWidth("[" + g.b6[5] + "]" + str2));
          } else {
            this.jdField_new = -1;
          }
          String str3 = str1.substring(str1.indexOf(":") + 2);
          int i1 = this.bE;
          try
          {
            this.bE = Byte.parseByte(str1.substring(str1.indexOf(":") + 1, str1.indexOf(":") + 2));
          }
          catch (Exception localException1)
          {
            this.bE = 0;
          }
          if (str3.length() > 1) {
            try
            {
              int i2 = str3.indexOf("/");
              this.aX = -1;
              if ((i2 >= 0) && (-1 != (this.aX = d(str3.substring(i2, i2 + 2)))))
              {
                jdMethod_for();
                str4 = str3.substring(0, i2);
                str3 = str4 + this.ak + str3.substring(i2 + 2, str3.length());
                String str5 = "[" + g.b6[5] + "]" + str2 + (this.ao ? "  " : "") + ":" + str4;
                this.b6 = ((short)(dA.stringWidth(str5) + 1));
              }
              else
              {
                this.aX = -1;
              }
            }
            catch (Exception localException2) {}
          } else {
            this.aX = -1;
          }
          int i3 = (byte)dA.stringWidth(" ");
          String str4 = " ";
          for (int i4 = 0; i4 < 12 / i3 - 1; i4 = (byte)(i4 + 1)) {
            str4 = str4 + " ";
          }
          this.L = ("[" + g.b6[5] + "]" + str2 + (this.ao ? str4 : "") + ":" + str3);
          this.r = 20;
          this.cQ = 20;
          if (this.bE > 0) {
            this.bs = 2;
          } else {
            this.bs = 1;
          }
          this.c2 = 2;
          a(0, this.L, (byte)5, this.aX, this.jdField_new);
          if (this.bE > 0)
          {
            if (i1 != this.bE)
            {
              p();
              l(this.bE);
            }
          }
          else {
            p();
          }
        }
      }
    }
    else if (this.L != null)
    {
      if (e())
      {
        if (this.bE > 0) {
          jdMethod_do();
        }
        this.eC = true;
        a(this.cJ.dH, 0, 0, dU, eA + 2);
        if (this.aX != -1) {
          a(this.cQ + this.b6, 1 + (eA - 12) / 2, 12, 12, this.aX % 6 * 12, this.aX / 6 * 12, this.aH[8], 0);
        }
        if (this.bE == 0) {
          this.fj.setColor(g.iO[5]);
        } else {
          this.fj.setColor(v());
        }
        this.fj.drawString(this.L, this.cQ, 1, 20);
        if (this.ao) {
          a(this.cQ + this.jdField_new, 1, 12, 12, 228, 0, this.aH[10], 0);
        }
      }
      if (this.r > 0)
      {
        this.r = ((byte)(this.r - 1));
      }
      else
      {
        this.cQ = ((short)(this.cQ - (this.c2 + this.t - 2)));
        if (this.cQ < -(this.fj.getFont().stringWidth(this.L) + (this.aX != -1 ? 15 : 0))) {
          if ((this.bs = (byte)(this.bs - 1)) > 0)
          {
            this.r = 20;
            this.cQ = 20;
          }
          else
          {
            this.L = null;
          }
        }
      }
    }
  }
  
  public void p()
  {
    this.ar = ((short[][])null);
    this.ap = ((short[][])null);
    this.Z = ((byte[][])null);
    this.aT = ((short[][])null);
  }
  
  public int v()
  {
    switch (this.cJ.jdField_int / 5 % 4)
    {
    case 0: 
      return b2[3][0];
    case 1: 
      return b2[0][0];
    case 2: 
      return b2[1][0];
    case 3: 
      return b2[4][0];
    }
    return b2[0][0];
  }
  
  public void l(byte paramByte)
  {
    byte b10;
    int i1;
    switch (paramByte)
    {
    case 4: 
    case 5: 
    case 8: 
      b10 = 0;
      switch (a9)
      {
      case 0: 
        b10 = 6;
        break;
      case 1: 
        b10 = 12;
        break;
      case 2: 
        b10 = 18;
      }
      this.ar = new short[1][b10];
      this.ap = new short[1][b10];
      this.Z = new byte[1][b10];
      this.au = new byte[1][b10];
      for (i1 = 0; i1 < b10; i1 = (byte)(i1 + 1)) {
        g(i1);
      }
      break;
    case 1: 
    case 3: 
    case 6: 
    case 7: 
      b10 = 0;
      switch (a9)
      {
      case 0: 
        b10 = 6;
        break;
      case 1: 
        b10 = 12;
        break;
      case 2: 
        b10 = 18;
      }
      this.ar = new short[1][b10];
      this.ap = new short[1][b10];
      this.Z = new byte[1][b10];
      this.aT = new short[1][b10];
      this.au = new byte[1][b10];
      for (i1 = 0; i1 < b10; i1 = (byte)(i1 + 1)) {
        d(i1);
      }
      break;
    case 2: 
      b10 = 0;
      switch (a9)
      {
      case 0: 
        b10 = 2;
        break;
      case 1: 
        b10 = 4;
        break;
      case 2: 
        b10 = 6;
      }
      this.ar = new short[b10][25];
      this.ap = new short[b10][25];
      this.Z = new byte[b10][25];
      this.aT = new short[b10][25];
      this.au = new byte[b10][25];
      int i2;
      for (i1 = 0; i1 < this.ar.length; i2 = (byte)(i1 + 1)) {
        f(i1);
      }
    }
  }
  
  public void g(byte paramByte)
  {
    this.ar[0][paramByte] = ((short)jdMethod_if(10, dU - 10));
    this.ap[0][paramByte] = ((short)jdMethod_if(10, fp - 10));
    this.Z[0][paramByte] = ((byte)jdMethod_if(20, 30));
    this.au[0][paramByte] = 0;
  }
  
  public void d(byte paramByte)
  {
    this.ar[0][paramByte] = ((short)jdMethod_if(20, dU - 20));
    this.ap[0][paramByte] = ((short)jdMethod_if(0, 30));
    this.Z[0][paramByte] = ((byte)jdMethod_if(-20, 20));
    this.aT[0][paramByte] = ((short)jdMethod_if(3, 8));
    if (jdMethod_if(0, 1) == 0) {
      this.au[0][paramByte] = 1;
    } else {
      this.au[0][paramByte] = -1;
    }
  }
  
  public void f(byte paramByte)
  {
    int i1 = (short)jdMethod_if(10, dU - 10);
    int i2 = (short)jdMethod_if(10, fp - 10);
    for (int i3 = 0; i3 < this.ar[paramByte].length; i3 = (byte)(i3 + 1))
    {
      this.ar[paramByte][i3] = i1;
      this.aT[paramByte][i3] = ((short)jdMethod_if(0, 360));
      this.ap[paramByte][i3] = i2;
      this.Z[paramByte][i3] = ((byte)jdMethod_if(6, 16));
      this.au[paramByte][0] = ((byte)jdMethod_if(3, 7));
    }
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2;
    for (int i1 = 0; i1 < this.ar[0].length; i2 = (byte)(i1 + 1))
    {
      int tmp23_21 = i1;
      short[] tmp23_20 = this.ap[0];
      tmp23_20[tmp23_21] = ((short)(tmp23_20[tmp23_21] + this.aT[0][i1]));
      int tmp45_43 = i1;
      byte[] tmp45_42 = this.Z[0];
      tmp45_42[tmp45_43] = ((byte)(tmp45_42[tmp45_43] + (this.ar[0][i1] % 2 == 0 ? 2 : 3) * this.au[0][i1]));
      if (this.Z[0][i1] >= 20) {
        this.au[0][i1] = -1;
      } else if (this.Z[0][i1] <= -20) {
        this.au[0][i1] = 1;
      }
      a(this.ar[0][i1] + this.Z[0][i1], this.ap[0][i1], 12, 12, paramInt1 * 12, paramInt2 * 12, this.aH[8], (paramBoolean) && (this.ar[0][i1] % 2 == 0) ? 2 : 0);
      if (this.ap[0][i1] > fp) {
        d(i1);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i2;
    for (int i1 = 0; i1 < this.ar[0].length; i2 = (byte)(i1 + 1))
    {
      int tmp20_19 = i1;
      this.au[0];
      if ((tmp20_18[tmp20_19] = (byte)(tmp20_18[tmp20_19] + 1)) >= 10) {
        a(this.ar[0][i1] + this.Z[0][i1], this.ap[0][i1], 12, 12, paramInt1 * 12, paramInt2 * 12, this.aH[8], 0);
      }
      if (this.au[0][i1] > this.Z[0][i1]) {
        g(i1);
      }
    }
  }
  
  public void jdMethod_do()
  {
    switch (this.bE)
    {
    case 8: 
      a(1, 4);
      break;
    case 4: 
      a(2, 3);
      break;
    case 5: 
      a(3, 4);
      break;
    case 6: 
      a(2, 0, true);
      break;
    case 7: 
      a(4, 3, true);
      break;
    case 1: 
      a(3, 3, true);
      break;
    case 3: 
      a(0, 4, false);
      break;
    case 2: 
      int i2;
      for (int i1 = 0; i1 < this.ar.length; i2 = (byte)(i1 + 1))
      {
        int i3 = 1;
        int i5;
        for (int i4 = 0; i4 < this.ar[0].length; i5 = (byte)(i4 + 1)) {
          if (this.Z[i1][i4] > 0)
          {
            this.fj.setColor(a3.goto[this.au[i1][0]][((i1 + i4 + this.cJ.jdField_int % 2) % 4)]);
            this.fj.fillArc(this.ar[i1][i4], this.ap[i1][i4], Math.max(1, this.Z[i1][i4] / 2), Math.max(1, this.Z[i1][i4] / 2), 0, 360);
            int tmp253_252 = i4;
            short[] tmp253_251 = this.ar[i1];
            tmp253_251[tmp253_252] = ((short)(tmp253_251[tmp253_252] + this.Z[i1][i4] * jdMethod_new(this.aT[i1][i4]) / 256));
            int tmp289_288 = i4;
            short[] tmp289_287 = this.ap[i1];
            tmp289_287[tmp289_288] = ((short)(tmp289_287[tmp289_288] + this.Z[i1][i4] * jdMethod_do(this.aT[i1][i4]) / 256));
            int tmp325_324 = i4;
            byte[] tmp325_323 = this.Z[i1];
            tmp325_323[tmp325_324] = ((byte)(tmp325_323[tmp325_324] - 1));
            if (this.Z[i1][i4] < 0) {
              this.Z[i1][i4] = 0;
            } else {
              i3 = 0;
            }
          }
        }
        if ((i3 != 0) && (this.cJ.jdField_int % (jdMethod_if(3, 6) * 10) == 0)) {
          f(i1);
        }
      }
    }
  }
  
  private void jdMethod_for()
  {
    if (this.ak != null) {
      return;
    }
    int i1 = dA.stringWidth(" ");
    int i2 = (byte)(12 / i1);
    if (i2 * i1 < 12) {
      i2 = (byte)(i2 + 1);
    }
    this.ak = " ";
    for (int i3 = 0; i3 < i2 - 1; i3 = (byte)(i3 + 1)) {
      this.ak += " ";
    }
  }
  
  public void h()
  {
    String str1 = "";
    this.cJ.d9 = false;
    if ((this.cJ.db == null) && (!this.cJ.kP.isEmpty()))
    {
      synchronized (this.cJ.kP)
      {
        str1 = (String)this.cJ.kP.elementAt(0);
        this.cJ.kP.removeElementAt(0);
        this.cJ.e5 = jdMethod_if(str1);
        if ((this.eQ != 0) && (this.cJ.e5 == 0)) {
          return;
        }
        if ((this.cZ.es.equals("")) && (g(str1))) {
          return;
        }
        String str2 = jdMethod_null(str1);
        if (str2.length() > 0)
        {
          this.cJ.dz = jdMethod_else(str1);
          if (this.cJ.dz) {
            this.cJ.gH = ((short)dA.stringWidth("[" + g.b6[this.cJ.e5] + "]" + str2));
          } else {
            this.cJ.gH = -1;
          }
          this.cJ.kM = g.iO[this.cJ.e5];
          String str3 = str1.substring(str1.indexOf(":") + 1);
          if (str3.length() > 1) {
            try
            {
              int i2 = str3.indexOf("/");
              this.cJ.e1 = -1;
              if ((i2 >= 0) && (-1 != (this.cJ.e1 = d(str3.substring(i2, i2 + 2)))))
              {
                jdMethod_for();
                str4 = str3.substring(0, i2);
                str3 = str4 + this.ak + str3.substring(i2 + 2, str3.length());
                String str5 = "[" + g.b6[this.cJ.e5] + "]" + str2 + (this.cJ.dz ? "  " : "") + ":" + str4;
                String[] arrayOfString = jdMethod_do(str5, dU);
                this.cJ.bY = ((byte)(arrayOfString.length - 1));
                this.cJ.ju = ((short)(dA.stringWidth(arrayOfString[(arrayOfString.length - 1)]) + 1));
              }
              else
              {
                this.cJ.e1 = -1;
              }
            }
            catch (Exception localException) {}
          } else {
            this.cJ.e1 = -1;
          }
          int i3 = (byte)dA.stringWidth(" ");
          String str4 = " ";
          for (int i4 = 0; i4 < 12 / i3 - 1; i4 = (byte)(i4 + 1)) {
            str4 = str4 + " ";
          }
          str1 = "[" + g.b6[this.cJ.e5] + "]" + str2 + (this.cJ.dz ? str4 : "") + ":" + str3;
          if (this.cJ.e5 != 3) {
            a(0, str1, this.cJ.e5, this.cJ.e1, this.cJ.gH);
          }
          if (this.cJ.e5 == 4) {
            a(1, str1, this.cJ.e5, this.cJ.e1, this.cJ.gH);
          }
          if (this.cJ.e5 == 2) {
            a(2, str1, this.cJ.e5, this.cJ.e1, this.cJ.gH);
          }
          if (this.cJ.e5 == 1) {
            a(3, str1, this.cJ.e5, this.cJ.e1, this.cJ.gH);
          }
          if (this.cJ.e5 == 3) {
            a(4, str1, this.cJ.e5, this.cJ.e1, this.cJ.gH);
          }
        }
      }
      this.cJ.bp = (fp - this.cJ.i4);
      this.cJ.b0 = fp;
      this.cJ.hF = 1;
      this.cJ.db = jdMethod_do(str1, dU);
      this.cJ.dS = this.cJ.db.length;
      this.cJ.e8 = (this.cJ.bp - this.cJ.dS * eA);
    }
    else if (this.cJ.db != null)
    {
      if (g())
      {
        this.cJ.d9 = true;
        a(this.cJ.dH, 0, this.cJ.bp, dU, this.cJ.i4);
        this.fj.setColor(this.cJ.kM);
        this.fj.setClip(0, this.cJ.bp, dU, this.cJ.i4);
        for (int i1 = 0; i1 < this.cJ.dS; i1++)
        {
          this.fj.drawString(this.cJ.db[i1], this.cJ.hF, this.cJ.b0 + i1 * (eA + 1), 20);
          if ((i1 == this.cJ.bY) && (this.cJ.e1 >= 0)) {
            a(this.cJ.ju, this.cJ.b0 + i1 * (eA + 1) + (eA - 12) / 2, 12, 12, this.cJ.e1 % 6 * 12, this.cJ.e1 / 6 * 12, this.aH[8], 0);
          }
          if ((i1 == 0) && (this.cJ.dz)) {
            a(this.cJ.gH, this.cJ.b0 + i1 * (eA + 1) + (eA - 12) / 2, 12, 12, 228, 0, this.aH[10], 0);
          }
        }
        this.fj.setClip(0, 0, dU, fp);
      }
      if (this.cJ.b0 >= this.cJ.e8) {
        this.cJ.b0 -= this.t;
      } else {
        this.cJ.db = null;
      }
    }
  }
  
  public boolean g()
  {
    if (this.eQ == 1) {
      return false;
    }
    return (this.cJ.jdField_do != 89) && (this.cJ.jdField_do != 15) && ((this.cJ.jdField_do == 0) || (this.cJ.e5 == 4) || (this.cJ.e5 == 2) || (a9 == 2));
  }
  
  public boolean e()
  {
    if (this.eQ == 1) {
      return false;
    }
    return (this.cJ.jdField_do == 0) || (this.cJ.jdField_do == 15) || (this.cJ.jdField_do == 89) || (this.cJ.jdField_do == 1) || (this.cJ.jdField_do == 26) || (this.cJ.jdField_do == 27) || (this.cJ.jdField_do == 2) || (this.cJ.jdField_do == 98);
  }
  
  public void c(byte paramByte)
  {
    if (this.dq >= 2) {
      return;
    }
    if ((this.cY[0] != 0) && (this.cY[1] != 0)) {
      return;
    }
    int i1 = 0;
    if (this.cY[0] != 0) {
      i1 = 1;
    }
    for (int i2 = 0; i2 < 10; i2 = (byte)(i2 + 1))
    {
      this.cp[i1][i2] = ((short)jdMethod_if(-15, 15));
      this.cn[i1][i2] = ((short)jdMethod_if(-8, 0));
      this.dO[i1][i2] = ((byte)jdMethod_if(3, 7));
      this.fD[i1][i2] = 'Ď';
    }
    this.cL[i1] = paramByte;
    this.cX[i1] = 0;
    this.cY[i1] = true;
    this.dq = ((byte)(this.dq + 1));
  }
  
  public void jdMethod_null()
  {
    if (this.dq > 0)
    {
      int i1 = this.cZ.aP + this.cZ.aK / 2 - ag.hF;
      int i2 = this.cZ.aM + this.cZ.bA - ag.hE;
      for (int i3 = 0; i3 < 2; i3 = (byte)(i3 + 1)) {
        if (this.cY[i3] != 0)
        {
          int tmp80_79 = i3;
          byte[] tmp80_76 = this.cX;
          tmp80_76[tmp80_79] = ((byte)(tmp80_76[tmp80_79] + 1));
          switch (this.cL[i3])
          {
          case 0: 
            this.fj.setColor(16711680);
            break;
          case 1: 
            this.fj.setColor(65280);
            break;
          case 2: 
            this.fj.setColor(255);
            break;
          case 3: 
            this.fj.setColor(16711935);
            break;
          case 4: 
            this.fj.setColor(16746240);
          }
          for (int i4 = 0; i4 < 10; i4 = (byte)(i4 + 1))
          {
            if (this.dO[i3][i3] > 0)
            {
              if (this.dO[i3][i3] >= 2)
              {
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                if ((this.cX[i3] + i4) % 2 == 0)
                {
                  i5 = this.cp[i3][i4];
                  i6 = this.cn[i3][i4] - 2;
                  i7 = this.cp[i3][i4];
                  i8 = this.cn[i3][i4] + 3;
                  i9 = this.cp[i3][i4] - 2;
                  i10 = this.cn[i3][i4];
                  i11 = this.cp[i3][i4] + 3;
                  i12 = this.cn[i3][i4];
                }
                else
                {
                  i5 = this.cp[i3][i4] - 2;
                  i6 = this.cn[i3][i4] - 2;
                  i7 = this.cp[i3][i4] + 3;
                  i8 = this.cn[i3][i4] + 3;
                  i9 = this.cp[i3][i4] + 2;
                  i10 = this.cn[i3][i4] - 2;
                  i11 = this.cp[i3][i4] - 3;
                  i12 = this.cn[i3][i4] + 3;
                }
                this.fj.drawLine(i5 + i1, i6 + i2, i7 + i1, i8 + i2);
                this.fj.drawLine(i9 + i1, i10 + i2, i11 + i1, i12 + i2);
              }
              int i13 = 4;
              if (this.dO[i3][i4] < 4) {
                i13 = 2;
              } else if (this.dO[i3][i4] < 2) {
                i13 = 1;
              }
              this.fj.fillArc(this.cp[i3][i4] + i1 - i13 / 2, this.cn[i3][i4] + i2 - i13 / 2, i13, i13, 0, 360);
              int tmp579_577 = i4;
              short[] tmp579_576 = this.cp[i3];
              tmp579_576[tmp579_577] = ((short)(tmp579_576[tmp579_577] + this.dO[i3][i4] * jdMethod_new(this.fD[i3][i4]) / 256));
              int tmp618_616 = i4;
              short[] tmp618_615 = this.cn[i3];
              tmp618_615[tmp618_616] = ((short)(tmp618_615[tmp618_616] + this.dO[i3][i4] * jdMethod_do(this.fD[i3][i4]) / 256));
              if (this.cX[i3] % 2 == 0)
              {
                int tmp668_666 = i4;
                byte[] tmp668_665 = this.dO[i3];
                tmp668_665[tmp668_666] = ((byte)(tmp668_665[tmp668_666] - 1));
              }
              if (this.dO[i3][i4] < 0) {
                this.dO[i3][i4] = 0;
              }
            }
            if ((this.cX[i3] >= 8) && (i4 == 9))
            {
              this.cY[i3] = false;
              this.dq = ((byte)(this.dq - 1));
            }
          }
        }
      }
    }
  }
  
  public static short a(short[] paramArrayOfShort, short paramShort)
  {
    int i1 = 0;
    int i2 = (short)(paramArrayOfShort.length - 1);
    while (i1 <= i2)
    {
      short s1 = (short)((i1 + i2) / 2);
      if (paramArrayOfShort[s1] == paramShort) {
        return s1;
      }
      if (paramShort > paramArrayOfShort[s1]) {
        i1 = (short)(s1 + 1);
      } else {
        i2 = (short)(s1 - 1);
      }
    }
    return -1;
  }
  
  public void f()
  {
    if ((g.dD != 1) || (g.dZ != 1) || (!this.cZ.gE)) {
      return;
    }
    for (int i1 = 0; i1 < this.bR.d.size(); i1++)
    {
      ao localao = (ao)this.bR.d.elementAt(i1);
      if ((this.jdField_else >= 0) && (localao.P == 3) && (localao.j == this.cJ.jdField_if)) {
        a("(" + this.jdField_else + "/" + localao.jdField_for[1] + ")", dU, 50, 24, b2[4][0]);
      }
    }
  }
  
  public void b(String paramString)
  {
    if (this.bR.a((byte)5)) {
      return;
    }
    if (!jdMethod_case((short)this.cJ.es))
    {
      this.cJ.a("该玩家没有摆摊.", (short)0, false, 9999);
      return;
    }
    if (this.aG.jdMethod_int(6781))
    {
      this.aG.jdMethod_if(paramString);
      this.aG.jdMethod_if();
    }
    this.cJ.jdField_do = 21;
  }
  
  public void jdMethod_long()
  {
    a((byte)2, 0, 0, g.f5, g.l7, true);
    a((byte)2, 0, 0, g.f5, g.l7 - 33, false);
    int i1 = 9;
    int i2 = 14;
    this.i.a(i1, i2);
    short s1 = -1;
    if (this.cJ.lY + this.cJ.lX * 6 < this.cJ.bs[this.cJ.hC]) {
      s1 = this.cJ.nl[this.cJ.hC][(this.cJ.lY + this.cJ.lX * 6)];
    }
    if ((this.cJ.jdField_do == 126) || (this.cJ.jdField_do == 48) || (this.cJ.jdField_do == -9))
    {
      if (this.cJ.hC > 0) {
        a(5 + (this.cJ.jdField_int % 6 == 0 ? 1 : -1), (g.l7 - 30 - 14) / 2, 14, 8, 0, 0, this.aH[4], 6);
      }
      if (this.cJ.hC < this.cJ.nc - 1) {
        a(g.f5 - 5 - 8 + (this.cJ.jdField_int % 6 == 0 ? -1 : 1), (g.l7 - 30 - 14) / 2, 14, 8, 0, 0, this.aH[4], 5);
      }
    }
    int i3 = 23;
    int i4 = 3;
    if ((s1 != -1) && (this.cJ.jdField_do != 126) && (this.cJ.jdField_do != 48) && (this.cJ.jdField_do != -9) && (this.cJ.jdField_do != -39) && (this.cJ.jdField_do != -52) && (this.cJ.jdField_do != -54) && (this.cJ.jdField_do != -53) && (this.cJ.jdField_do != -55) && (this.cJ.jdField_do != -56) && (this.cJ.jdField_do != -54))
    {
      a(i3, i4, 12, 12, 0, 0, this.aH[10], 0);
      a(i3 + 13, i4 + 5, this.cJ.lK[this.cJ.hC][(this.cJ.lY + this.cJ.lX * 6)], 20);
    }
    if ((this.cJ.jdField_do != 126) && (this.cJ.jdField_do != 48) && (this.cJ.jdField_do != -9) && (this.cJ.jdField_do != -39) && (this.cJ.jdField_do != -52) && (this.cJ.jdField_do != -54) && (this.cJ.jdField_do != -53) && (this.cJ.jdField_do != -55) && (this.cJ.jdField_do != -56) && (this.cJ.jdField_do != -54))
    {
      a(i3 + 54, i4, 12, 12, 12, 0, this.aH[10], 0);
      long l1 = this.cJ.bO;
      for (int i6 = 0; i6 < this.cJ.bs[this.cJ.hC]; i6 = (byte)(i6 + 1)) {
        if (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i6], 2) > 0) {
          if (this.cJ.hB == 0) {
            l1 -= a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i6], 2) * this.cJ.lK[this.cJ.hC][i6];
          } else {
            l1 += a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i6], 2) * this.cJ.lK[this.cJ.hC][i6];
          }
        }
      }
      a(i3 + 54 + 13, i4 + 5, l1, 20);
    }
    if (g.kj < 8)
    {
      this.fj.setColor(0);
      this.fj.fillRect(i1 + g.lQ * 18 + 1, i2, 3, 18 * g.kj);
      this.fj.setColor(15724527);
      this.fj.fillRect(i1 + g.lQ * 18 + 2, i2 + this.cJ.lX * 18 * g.kj / 8, 1, 18 * g.kj / 8);
    }
    if (this.cJ.lX >= g.kj) {
      i2 -= 18 * g.kj;
    }
    for (int i5 = 0; i5 < this.cJ.bs[this.cJ.hC]; i5 = (byte)(i5 + 1))
    {
      if (this.cJ.lX < g.kj)
      {
        if (i5 >= g.lQ * g.kj) {
          break;
        }
      }
      else {
        if (i5 < g.lQ * g.kj) {
          continue;
        }
      }
      if (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2) > 0)
      {
        this.fj.setColor(b2[4][0]);
        this.fj.fillRect(i1 + 18 * (i5 % 6) + 2, i2 + 18 * (i5 / 6) + 2, 18 - 3, 18 - 3);
      }
      a(i1 + 18 * (i5 % 6) + 2, i2 + 18 * (i5 / 6) + 2, this.cJ.nl[this.cJ.hC][i5]);
      if (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2) > 0) {
        a(i1 + 18 * (i5 % 6) + 15 + 2, i2 + 18 * (i5 / 6) + 15 + 2, a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2), 40);
      } else if ((this.cJ.jdField_do == 46) || (this.cJ.jdField_do == 51) || (this.cJ.jdField_do == 10) || (this.cJ.jdField_do == -80) || (this.cJ.jdField_do == -81) || (this.cJ.jdField_do == -82) || (this.cJ.jdField_do == 9) || (this.cJ.jdField_do == -78) || (this.cJ.jdField_do == 12) || (this.cJ.jdField_do == -83) || (this.cJ.jdField_do == 126) || (this.cJ.jdField_do == 48) || (this.cJ.jdField_do == -9)) {
        a(i1 + 18 * (i5 % 6) + 15 + 2, i2 + 18 * (i5 / 6) + 15 + 2, a3.jdMethod_do(this.cJ.ev[this.cJ.hC][i5], 2), 40);
      }
    }
    this.i.jdMethod_do(s1);
    if ((this.cJ.lY >= 0) && (this.cJ.lX >= 0) && (this.cJ.lY < 6) && (this.cJ.lX < 8))
    {
      this.fj.setColor(b2[4][0]);
      this.fj.drawRect(i1 + this.cJ.lY * 18 + this.cJ.jdField_int / 3 % 2, i2 + this.cJ.lX * 18 + this.cJ.jdField_int / 3 % 2, 18 - 2 * (this.cJ.jdField_int / 3 % 2), 18 - 2 * (this.cJ.jdField_int / 3 % 2));
    }
  }
  
  public void s()
  {
    a((byte)2, 0, 0, g.f5, g.l7, true);
    a((byte)2, 0, 0, g.f5, g.l7 - 33, false);
    int i1 = 9;
    int i2 = 14;
    this.i.a(i1, i2);
    short s1 = -1;
    if (this.cJ.lY + this.cJ.lX * 6 < this.cJ.bs[this.cJ.hC]) {
      s1 = this.cJ.nl[this.cJ.hC][(this.cJ.lY + this.cJ.lX * 6)];
    }
    int i3 = 23;
    int i4 = 3;
    if ((s1 != -1) && (this.cJ.jdField_do != 119) && (this.cJ.jdField_do != -97) && (this.cJ.jdField_do != -98) && (this.cJ.jdField_do != 120) && (this.cJ.jdField_do != 121) && (this.cJ.jdField_do != 68) && (this.cJ.jdField_do != 84) && (this.cJ.jdField_do != 85) && (this.cJ.jdField_do != 54) && (this.cJ.jdField_do != 49) && (this.cJ.jdField_do != 66) && (this.cJ.jdField_do != -52) && (this.cJ.jdField_do != -53) && (this.cJ.jdField_do != -54) && (this.cJ.jdField_do != -55) && (this.cJ.jdField_do != -56) && (this.cJ.jdField_do != -57) && (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][(this.cJ.lY + this.cJ.lX * 6)], 2) > 0))
    {
      a(i3, i4, 12, 12, 0, 0, this.aH[10], 0);
      a(i3 + 12, i4 + 5, this.cJ.lK[this.cJ.hC][(this.cJ.lY + this.cJ.lX * 6)], 20);
    }
    if ((this.cJ.jdField_do != 119) && (this.cJ.jdField_do != -97) && (this.cJ.jdField_do != -98) && (this.cJ.jdField_do != 120) && (this.cJ.jdField_do != 121) && (this.cJ.jdField_do != 68) && (this.cJ.jdField_do != 84) && (this.cJ.jdField_do != 85) && (this.cJ.jdField_do != 54) && (this.cJ.jdField_do != 49) && (this.cJ.jdField_do != 66) && (this.cJ.jdField_do != -52) && (this.cJ.jdField_do != -53) && (this.cJ.jdField_do != -54) && (this.cJ.jdField_do != -55) && (this.cJ.jdField_do != -56) && (this.cJ.jdField_do != -57))
    {
      a(i3 + 54, i4, 12, 12, 12, 0, this.aH[10], 0);
      long l1 = this.cJ.bO;
      a(i3 + 54 + 12, i4 + 5, l1, 20);
    }
    if (g.kj < 8)
    {
      this.fj.setColor(0);
      this.fj.fillRect(i1 + g.lQ * 18 + 1, i2, 3, 18 * g.kj);
      this.fj.setColor(15724527);
      this.fj.fillRect(i1 + g.lQ * 18 + 2, i2 + this.cJ.lX * 18 * g.kj / 8, 1, 18 * g.kj / 8);
    }
    if (this.cJ.lX >= g.kj) {
      i2 -= 18 * g.kj;
    }
    for (int i5 = 0; i5 < this.cJ.bs[this.cJ.hC]; i5 = (byte)(i5 + 1))
    {
      if (this.cJ.lX < g.kj)
      {
        if (i5 >= g.lQ * g.kj) {
          break;
        }
      }
      else {
        if (i5 < g.lQ * g.kj) {
          continue;
        }
      }
      if (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2) > 0)
      {
        this.fj.setColor(b2[4][0]);
        this.fj.fillRect(i1 + 18 * (i5 % 6) + 2, i2 + 18 * (i5 / 6) + 2, 15, 18 - 3);
      }
      a(i1 + 18 * (i5 % 6) + 2, i2 + 18 * (i5 / 6) + 2, this.cJ.nl[this.cJ.hC][i5]);
      int i6 = 0;
      if (a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2) > 0) {
        i6 = a3.jdMethod_do(this.cJ.jv[this.cJ.hC][i5], 2);
      } else if ((this.cJ.jdField_do != 126) && (this.cJ.jdField_do != 48) && (this.cJ.jdField_do != -9)) {
        i6 = this.cZ.jdMethod_if(this.cJ.nl[this.cJ.hC][i5]);
      } else {
        i6 = this.e0.a(this.cJ.nl[this.cJ.hC][i5]);
      }
      a(i1 + 18 * (i5 % 6) + 15 + 2, i2 + 18 * (i5 / 6) + 15 + 2, i6, 40);
    }
    this.i.jdMethod_do(s1);
    if ((this.cJ.lY >= 0) && (this.cJ.lX >= 0) && (this.cJ.lY < 6) && (this.cJ.lX < 8))
    {
      this.fj.setColor(b2[4][0]);
      this.fj.drawRect(i1 + this.cJ.lY * 18 + this.cJ.jdField_int / 3 % 2, i2 + this.cJ.lX * 18 + this.cJ.jdField_int / 3 % 2, 18 - 2 * (this.cJ.jdField_int / 3 % 2), 18 - 2 * (this.cJ.jdField_int / 3 % 2));
    }
  }
  
  public void jdMethod_do(byte paramByte)
  {
    if ((this.cZ.a7[paramByte] != -1) && (this.cZ.fc[paramByte] != 0))
    {
      if (this.cZ.a8)
      {
        this.cJ.a(11, (short)31, false, 9999);
        return;
      }
      this.cZ.y();
      byte b10 = 0;
      short[] arrayOfShort1 = null;
      for (int i1 = 0; i1 < 2; i1 = (byte)(i1 + 1))
      {
        b10 = 0;
        for (i2 = 0; i2 < this.cZ.gJ[0]; i2 = (byte)(i2 + 1)) {
          if ((!v(this.cZ.gw[0][i2])) && (!o(this.cZ.gw[0][i2])) && (jdMethod_try(this.cZ.gw[0][i2]) != 7))
          {
            if (i1 == 1) {
              arrayOfShort1[b10] = this.cZ.gw[0][i2];
            }
            b10 = (byte)(b10 + 1);
          }
        }
        if (i1 == 0) {
          arrayOfShort1 = new short[b10];
        }
      }
      this.i.a(1, (byte)0, b10, arrayOfShort1, new short[arrayOfShort1.length]);
      short[] arrayOfShort2 = new short[this.cZ.gJ[0]];
      System.arraycopy(this.cZ.gw[0], 0, arrayOfShort2, 0, this.cZ.gJ[0]);
      this.i.a(arrayOfShort2, true);
      int i2 = jdMethod_do(this.cZ.a7[paramByte]);
      if (i2 == 0) {
        i2 = 2;
      }
      this.bJ = new short[i2];
      this.fr = new short[i2];
      for (int i3 = 0; i3 < this.fr.length; i3 = (byte)(i3 + 1)) {
        this.fr[i3] = ((short)a3.jdMethod_new(0, 2));
      }
      this.cJ.jdField_int = 0;
      this.cJ.jdField_do = 119;
    }
    else
    {
      this.cJ.a(12, (short)31, false, 9999);
    }
  }
  
  public String[] a(ao paramao)
  {
    String[] arrayOfString1 = jdMethod_do(paramao.i, dU - 10);
    String[] arrayOfString2 = new String[arrayOfString1.length + 3 + ((ak.jdMethod_if(paramao.E) == 7) || (ak.jdMethod_if(paramao.E) == 8) || (ak.jdMethod_if(paramao.E) == 9) ? 0 : 2)];
    System.arraycopy(arrayOfString1, 0, arrayOfString2, 3 + ((ak.jdMethod_if(paramao.E) == 7) || (ak.jdMethod_if(paramao.E) == 8) || (ak.jdMethod_if(paramao.E) == 9) ? 0 : 2), arrayOfString1.length);
    String str1 = null;
    if (ak.jdMethod_if(paramao.E) == 5) {
      str1 = "常规";
    } else if (ak.jdMethod_if(paramao.E) == 6) {
      str1 = "活动";
    } else if (ak.jdMethod_if(paramao.E) == 0) {
      str1 = "商盟";
    } else if (ak.jdMethod_if(paramao.E) == 1) {
      str1 = "佣兵团";
    } else if (ak.jdMethod_if(paramao.E) == 2) {
      str1 = "盗贼团";
    } else if (ak.jdMethod_if(paramao.E) == 3) {
      str1 = "刺客团";
    } else if (ak.jdMethod_if(paramao.E) == 7) {
      str1 = "每日任务";
    } else if (ak.jdMethod_if(paramao.E) == 9) {
      str1 = "公会任务";
    } else if (ak.jdMethod_if(paramao.E) == 8) {
      str1 = "悬赏任务";
    } else {
      str1 = "常规";
    }
    if ((ak.jdMethod_if(paramao.E) == 7) || (ak.jdMethod_if(paramao.E) == 8) || (ak.jdMethod_if(paramao.E) == 9))
    {
      arrayOfString2[0] = ("类型:" + str1);
      arrayOfString2[1] = ("等级:" + paramao.N + "-" + paramao.r);
      if (ak.jdMethod_if(paramao.E) == 9) {
        arrayOfString2[2] = ("所需贡献度:" + paramao.o);
      } else {
        arrayOfString2[2] = ("押金:" + paramao.o);
      }
    }
    else
    {
      arrayOfString2[0] = ("区域:" + paramao.C);
      arrayOfString2[1] = ("类型:" + str1);
      String str2 = null;
      switch (paramao.B)
      {
      case 0: 
        str2 = "低";
        break;
      case 1: 
        str2 = "中";
        break;
      case 2: 
        str2 = "高";
        break;
      case 3: 
        str2 = "极高";
        break;
      case 4: 
        str2 = "未知";
      }
      arrayOfString2[2] = ("难度:" + str2);
      arrayOfString2[3] = ("等级:" + paramao.N + "-" + paramao.r);
      arrayOfString2[4] = ("押金:" + paramao.o);
    }
    arrayOfString1 = null;
    return arrayOfString2;
  }
  
  public void jdMethod_long(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      String str = "";
      byte b10 = paramDataInputStream.readByte();
      int i2 = paramDataInputStream.readInt();
      byte b11 = paramDataInputStream.readByte();
      int i3 = paramDataInputStream.readByte();
      int i4 = paramDataInputStream.readByte();
      int i5 = paramDataInputStream.readByte();
      if (i2 == 0) {
        return;
      }
      if (i2 < 0) {
        str = str + "损失";
      } else {
        str = str + "获得";
      }
      switch (b10)
      {
      case 50: 
        str = str + "公会贡献度";
        break;
      case 0: 
        str = str + "金钱";
        break;
      case 4: 
        str = str + "经验";
        break;
      case 8: 
        str = str + "勋章值";
        break;
      case 12: 
        str = str + "状态";
        break;
      case 14: 
        str = str + "等级";
        break;
      case 16: 
        str = str + "生命";
        break;
      case 20: 
        str = str + "生命上限";
        break;
      case 24: 
        str = str + "魔力";
        if (i2 > 0) {
          this.de = 0;
        }
        break;
      case 26: 
        str = str + "魔力上限";
        break;
      case 28: 
        str = str + "物攻";
        break;
      case 30: 
        str = str + "物防";
        break;
      case 32: 
        str = str + "魔攻";
        break;
      case 34: 
        str = str + "魔防";
        break;
      case 36: 
        str = str + "配点值";
        break;
      case 40: 
        str = str + "敏捷";
        break;
      case 42: 
        str = str + "爆击";
        break;
      case 44: 
        str = str + "命中";
        break;
      case 46: 
        str = str + "威力";
        break;
      case 1: 
      case 2: 
      case 3: 
      case 5: 
      case 6: 
      case 7: 
      case 9: 
      case 10: 
      case 11: 
      case 13: 
      case 15: 
      case 17: 
      case 18: 
      case 19: 
      case 21: 
      case 22: 
      case 23: 
      case 25: 
      case 27: 
      case 29: 
      case 31: 
      case 33: 
      case 35: 
      case 37: 
      case 38: 
      case 39: 
      case 41: 
      case 43: 
      case 45: 
      case 47: 
      case 48: 
      case 49: 
      default: 
        return;
      }
      if ((b10 == 12) || (b10 == 14))
      {
        this.cZ.jdMethod_if((byte)12, i2);
        str = str + "设为" + i2;
      }
      else if (i2 < 0)
      {
        if (-i2 > this.cZ.a(b10)) {
          i2 = -this.cZ.a(b10);
        }
        this.cZ.a(b10, -i2);
        str = str + -i2;
        if ((b10 == 20) && (this.cZ.a((byte)16) > this.cZ.a((byte)20))) {
          this.cZ.jdMethod_if((byte)16, this.cZ.a((byte)20));
        }
        if ((b10 == 26) && (this.cZ.a((byte)24) > this.cZ.a((byte)26))) {
          this.cZ.jdMethod_if((byte)24, this.cZ.a((byte)26));
        }
      }
      else
      {
        if (b10 == 16)
        {
          if (i2 > this.cZ.a((byte)20) - this.cZ.a((byte)16)) {
            i2 = this.cZ.a((byte)20) - this.cZ.a((byte)16);
          }
        }
        else if (b10 == 24)
        {
          if (i2 > this.cZ.a((byte)26) - this.cZ.a((byte)24)) {
            i2 = this.cZ.a((byte)26) - this.cZ.a((byte)24);
          }
        }
        else if ((b10 == 4) && (this.cZ.a((byte)14) >= bm)) {
          i2 = 0;
        }
        this.cZ.jdMethod_do(b10, i2);
        str = str + i2;
      }
      if (this.cJ.jdField_do == 0)
      {
        if (i5 == 1) {
          a((short)i2, this.cZ.aP, this.cZ.aM, b11);
        }
        if (i4 == 1) {
          c(b11);
        }
      }
      if (str.trim().length() > 0)
      {
        if (i3 == 1) {
          this.cJ.jdMethod_do(str);
        }
        if ((!this.cZ.gE) || (g.dD != 2) || (g.dZ != 1)) {
          this.cZ.Z();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  public void a(byte paramByte, short paramShort)
  {
    String str = "";
    switch (paramByte)
    {
    case 0: 
      str = str + "金钱";
      break;
    case 4: 
      str = str + "经验";
      break;
    case 8: 
      str = str + "勋章值";
      break;
    case 12: 
      str = str + "状态";
      break;
    case 14: 
      str = str + "等级";
      break;
    case 16: 
      str = str + "生命";
      break;
    case 20: 
      str = str + "生命上限";
      break;
    case 24: 
      str = str + "魔力";
      break;
    case 26: 
      str = str + "魔力上限";
      break;
    case 28: 
      str = str + "物攻";
      break;
    case 30: 
      str = str + "物防";
      break;
    case 32: 
      str = str + "魔攻";
      break;
    case 34: 
      str = str + "魔防";
      break;
    case 36: 
      str = str + "配点值";
      break;
    case 40: 
      str = str + "敏捷";
      break;
    case 42: 
      str = str + "爆击";
      break;
    case 44: 
      str = str + "命中";
      break;
    case 46: 
      str = str + "威力";
    }
    str = str + " +" + paramShort;
    this.cJ.a(str, (short)0, true, 9999);
  }
  
  public void u()
  {
    int i1 = fp - eA * 2 - 12;
    int i2 = dU - 10;
    a((dU - i2) / 2, i1 + 8, i2, 3, 15724527, this.fw, this.fw - this.av);
  }
  
  public boolean J()
  {
    return this.cJ.jdField_if == 55;
  }
  
  public boolean i(String paramString)
  {
    if ((!paramString.startsWith("/")) || (paramString.length() != 2)) {
      return false;
    }
    int i1 = paramString.charAt(1);
    return (i1 >= 48) && (i1 < 84);
  }
  
  public byte d(String paramString)
  {
    if (!i(paramString)) {
      return -1;
    }
    return (byte)(paramString.charAt(1) - '0');
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    for (int i1 = 0; i1 < paramInt3; i1 = (byte)(i1 + 1)) {
      a(paramInt1 + i1 * 12, paramInt2, 12, 12, 204, 0, this.aH[10], 0);
    }
  }
  
  public int a(a3 parama3, byte paramByte, short paramShort)
  {
    if (paramByte == 0)
    {
      this.fj.setColor(b2[2][1]);
      paramShort = (short)(paramShort + 8);
      this.fj.drawString(parama3.O, 5, paramShort, 0);
      if (this.cJ.jdField_do != -61)
      {
        if (parama3.a((byte)40) == 0)
        {
          this.fj.setColor(b2[4][0]);
          this.fj.drawString("死亡", (a9 == 0 ? '' : '°') / 2 - 5 + 40, paramShort, 0);
        }
        this.fj.setColor(b2[0][1]);
        this.fj.drawString(a3.bG[parama3.a(12)], (a9 == 0 ? '' : '°') / 2 - 5, paramShort, 0);
        if (((this.cJ.jdField_do == -34) || (this.cJ.jdField_do == -35)) && (parama3.a((byte)14) > 30) && (parama3.a((byte)12) == 2) && (this.cJ.jdField_int / 5 % 2 == 0)) {
          this.fj.drawString("进化", (a9 == 0 ? '' : '°') / 2 - 5 + 40, paramShort, 0);
        }
      }
      this.fj.setColor(b2[2][1]);
      paramShort = (short)(paramShort + eA);
      this.fj.drawString(a3.n[a(parama3)], (a9 == 0 ? '' : '°') / 2 - 5 + 40, paramShort, 0);
      this.fj.drawString(a3.ad[parama3.a(48)], (a9 == 0 ? '' : '°') / 2 - 5, paramShort, 0);
      a(5, paramShort + 5, 22, 11, 66, 0, this.aH[12], 0);
      a(28, paramShort + 6, parama3.a((byte)14), 20);
      a(38, paramShort + 6, parama3.a((byte)38));
      paramShort = (short)(paramShort + eA);
      int i1 = a((byte)parama3.a((byte)14), (byte)parama3.a((byte)38));
      int i2 = parama3.a((byte)4);
      a(5, paramShort + 5, 80 + (a9 == 0 ? 0 : 50), 5, 13421772, i1, i2);
      int i3 = i2 * 100 / i1;
      int i4 = i2 * 100 % i1;
      int i5 = i4 * 100 / i1;
      a(111 + (a9 == 0 ? 0 : 50) + 3, paramShort + 5, 5, 7, 55, 0, this.aH[5], 0);
      if (i5 < 10) {
        a(101 + (a9 == 0 ? 0 : 50) + 2, paramShort + 5, 0L, 20);
      }
      a(101 + (i5 < 10 ? 5 : 0) + (a9 == 0 ? 0 : 50) + 2, paramShort + 5, i5, 20);
      a(96 + (a9 == 0 ? 0 : 50) + 2, paramShort + 5, 5, 7, 80, 0, this.aH[5], 0);
      a(97 + (a9 == 0 ? 0 : 50) + 2, paramShort + 5, i3, 24);
      paramShort = (short)(paramShort + 20);
      this.fj.drawString("亲密", 5, paramShort, 0);
      a((a9 == 0 ? '' : '°') / 2 - 20, paramShort + 5, parama3.a((byte)40), 24);
      a((a9 == 0 ? '' : '°') / 2 - 20, paramShort + 5, 5, 7, 50, 0, this.aH[5], 0);
      a((a9 == 0 ? '' : '°') / 2 - 20 + 20, paramShort + 5, parama3.a((byte)16), 24);
      this.fj.drawString("IQ", (a9 == 0 ? '' : '°') / 2 + 5, paramShort, 0);
      a((a9 == 0 ? '' : '°') - 20, paramShort + 5, parama3.a((byte)46), 24);
      a((a9 == 0 ? '' : '°') - 20 + 2, paramShort + 5, 5, 7, 55, 0, this.aH[5], 0);
      return paramShort;
    }
    if (jdMethod_if(parama3, 4)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("活力", 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') / 2 - 20, paramShort + 5, parama3.a((byte)42), 24);
    a(parama3, (a9 == 0 ? '' : '°') / 2 - 20 + 1, paramShort + 5, 4);
    if (jdMethod_if(parama3, 5)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("魔法", (a9 == 0 ? '' : '°') / 2 + 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') - 28, paramShort + 5, parama3.a((byte)44), 24);
    a(parama3, (a9 == 0 ? '' : '°') - 28 + 1, paramShort + 5, 5);
    paramShort = (short)(paramShort + (eA + 5));
    if (jdMethod_if(parama3, 0)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("物攻", 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') / 2 - 20, paramShort + 5, parama3.a((byte)28), 24);
    a(parama3, (a9 == 0 ? '' : '°') / 2 - 20 + 1, paramShort + 5, 0);
    if (jdMethod_if(parama3, 1)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("物防", (a9 == 0 ? '' : '°') / 2 + 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') - 28, paramShort + 5, parama3.a((byte)30), 24);
    a(parama3, (a9 == 0 ? '' : '°') - 28 + 1, paramShort + 5, 1);
    paramShort = (short)(paramShort + (eA + 5));
    if (jdMethod_if(parama3, 2)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("魔攻", 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') / 2 - 20, paramShort + 5, parama3.a((byte)32), 24);
    a(parama3, (a9 == 0 ? '' : '°') / 2 - 20 + 1, paramShort + 5, 2);
    if (jdMethod_if(parama3, 3)) {
      this.fj.setColor(b2[0][1]);
    } else {
      this.fj.setColor(b2[2][1]);
    }
    this.fj.drawString("魔防", (a9 == 0 ? '' : '°') / 2 + 5, paramShort, 0);
    a((a9 == 0 ? '' : '°') - 28, paramShort + 5, parama3.a((byte)34), 24);
    a(parama3, (a9 == 0 ? '' : '°') - 28 + 1, paramShort + 5, 3);
    return paramShort;
  }
  
  public void a(a3 parama3, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    switch (paramInt3)
    {
    case 0: 
      i1 = parama3.a((byte)28);
      break;
    case 1: 
      i1 = parama3.a((byte)30);
      break;
    case 2: 
      i1 = parama3.a((byte)32);
      break;
    case 3: 
      i1 = parama3.a((byte)34);
      break;
    case 4: 
      i1 = parama3.a((byte)42);
      break;
    case 5: 
      i1 = parama3.a((byte)44);
    }
    int i2 = i1 * p((byte)parama3.a((byte)40)) / 10;
    if (i2 < i1)
    {
      a(paramInt1, paramInt2, 5, 7, 75, 0, this.aH[5], 0);
      a(paramInt1 + 6, paramInt2, i1 - i2, 20);
    }
  }
  
  public void jdMethod_case()
  {
    if (a9 == 0)
    {
      a((byte)2, 0, 0, 128, 128, true);
      a(this.b7, this.jdField_try, f0, null);
      if (this.b7[this.cJ.bf] != null) {
        if (this.cJ.mz == 0)
        {
          a(this.b7[this.cJ.bf], (byte)0, (short)22);
          a(dU / 2 - 7, fp - 10 + (this.cJ.jdField_int % 6 == 0 ? 1 : -1), 14, 8, 0, 0, this.aH[4], 3);
        }
        else
        {
          a(this.b7[this.cJ.bf], (byte)1, (short)35);
          a(dU / 2 - 7, 22 + (this.cJ.jdField_int % 6 == 0 ? -1 : 1), 14, 8, 0, 0, this.aH[4], 0);
        }
      }
    }
    else
    {
      a((byte)2, 0, 0, 176, 203, true);
      a(this.b7, this.jdField_try, f0, null);
      if (this.b7[this.cJ.bf] != null)
      {
        int i1 = a(this.b7[this.cJ.bf], (byte)0, (short)22);
        a(this.b7[this.cJ.bf], (byte)1, (short)(i1 + eA + 5));
      }
    }
  }
  
  public void a(a3[] paramArrayOfa3, byte paramByte1, byte paramByte2, boolean[] paramArrayOfBoolean)
  {
    int i1 = 20 + 2 + 20;
    int i2 = 5;
    int i3 = 5;
    for (byte b10 = 0; b10 < i3; b10 = (byte)(b10 + 1)) {
      if (b10 < paramByte2)
      {
        if ((paramArrayOfBoolean != null) && (paramArrayOfBoolean[b10] != 0))
        {
          this.fj.setColor(b2[4][0]);
          this.fj.fillRect(i1 + b10 * 17 - 2, i2 - 2, 20, 20);
        }
        a(i1 + b10 * 17, i2, 15, 15, 60, 0, this.fz, 0);
        if (this.cJ.bf == b10)
        {
          this.fj.setColor(b2[4][0]);
          this.fj.drawRect(i1 + b10 * 17 - 2 + this.cJ.jdField_int / 3 % 2, i2 - 2 + this.cJ.jdField_int / 3 % 2, 18 - 2 * (this.cJ.jdField_int / 3 % 2), 18 - 2 * (this.cJ.jdField_int / 3 % 2));
        }
      }
      else
      {
        a(i1 + b10 * 17, i2, 15, 15, 60, 0, this.fz, 0);
        a(i1 + b10 * 17, i2, 12, 12, 120, 0, this.aH[10], 0);
        a(i1 + b10 * 17 + 4, i2, 12, 12, 120, 0, this.aH[10], 0);
        a(i1 + b10 * 17, i2 + 4, 12, 12, 120, 0, this.aH[10], 0);
        a(i1 + b10 * 17 + 4, i2 + 4, 12, 12, 120, 0, this.aH[10], 0);
      }
    }
    for (b10 = 0; b10 < paramByte1; b10 = (byte)(b10 + 1)) {
      if (paramArrayOfa3[b10] != null)
      {
        a(i1 + b10 * 17 - 1, i2, 15, 15, 210, 0, this.cq, 0);
        if (this.cJ.bf == b10)
        {
          byte b11 = jdMethod_if(paramArrayOfa3[b10]);
          int i4 = ag.hE;
          if ((jdMethod_if(paramArrayOfa3[b10]) == 2) || (jdMethod_if(paramArrayOfa3[b10]) == 4)) {
            i4 += 12;
          }
          if (paramArrayOfa3[b10].a((byte)40) == 0)
          {
            if (b11 < 0) {
              return;
            }
            int[] arrayOfInt = new int[5];
            this.c0.a(4, 0, arrayOfInt);
            this.c0.a(b11, 0, arrayOfInt);
            int i5 = 20;
            int i6 = (short)(22 + ag.hF + 20);
            int i7 = (short)i4;
            i6 = (short)(i6 - (i5 + 10));
            this.c0.a(i6 - ag.hF, i7 - ag.hE, this.a2, arrayOfInt, 0);
          }
          else
          {
            a((short)(22 + ag.hF + 20), (short)i4, (byte)1, b11);
          }
        }
      }
    }
  }
  
  public byte K()
  {
    int i1 = this.jdField_for.get(11);
    return (byte)i1;
  }
  
  public byte[] n()
  {
    byte[] arrayOfByte = new byte[2];
    int i1 = this.jdField_for.get(12);
    if (i1 >= 10)
    {
      arrayOfByte[0] = ((byte)(i1 / 10));
      arrayOfByte[1] = ((byte)(i1 % 10));
    }
    else
    {
      arrayOfByte[0] = 0;
      arrayOfByte[1] = ((byte)i1);
    }
    return arrayOfByte;
  }
  
  public void jdMethod_new(int paramInt1, int paramInt2)
  {
    if ((this.e == null) || (this.cJ.jdField_int % 100 == 0))
    {
      this.jdField_for = Calendar.getInstance();
      this.db = K();
      this.e = n();
    }
    a(paramInt1, paramInt2, this.db, 20);
    if (this.db >= 10) {
      paramInt1 += 10;
    } else {
      paramInt1 += 5;
    }
    a(paramInt1, paramInt2, 5, 7, 110, 0, this.aH[5], 0);
    paramInt1 += 5;
    a(paramInt1, paramInt2, this.e[0], 20);
    paramInt1 += 5;
    a(paramInt1, paramInt2, this.e[1], 20);
  }
  
  public void a(int paramInt, DataInputStream paramDataInputStream)
  {
    try
    {
      int i3;
      switch (paramInt)
      {
      case 4107: 
        if (!this.cJ.e7) {
          return;
        }
        String str1 = paramDataInputStream.readUTF();
        String str2 = paramDataInputStream.readUTF();
        this.cJ.e7 = false;
        this.cJ.kg = -1;
        this.cJ.hD = null;
        this.cJ.bD = null;
        this.cJ.a(str1, (short)0, false, 9999);
        break;
      case 4110: 
        if (this.cJ.e7)
        {
          this.cJ.eE = paramDataInputStream.readShort();
          this.cJ.ly = paramDataInputStream.readShort();
        }
        break;
      case 4102: 
        int i1 = paramDataInputStream.readShort();
        int i2 = paramDataInputStream.readInt();
        this.cJ.bF = i2;
        if ((this.cZ.a8) || (this.cZ.jdMethod_else()) || (this.cJ.ki) || (this.cJ.e7) || (i1 != this.cJ.jdField_if) || (this.cZ.a((byte)0) < i2) || ((this.cJ.jdField_do != 0) && (this.cJ.jdField_do != 1) && (this.cJ.jdField_do != 2) && (this.cJ.jdField_do != 26) && (this.cJ.jdField_do != 27) && (this.cJ.jdField_do != 74) && (this.cJ.jdField_do != 15) && (this.cJ.jdField_do != 93) && (this.cJ.jdField_do != 29) && (this.cJ.jdField_do != 13) && (this.cJ.jdField_do != 109) && (this.cJ.jdField_do != 50) && (this.cJ.jdField_do != -34)))
        {
          if (this.aG.jdMethod_int(4103))
          {
            this.aG.jdMethod_do(0);
            this.aG.jdMethod_if();
          }
          return;
        }
        this.cJ.cw = paramDataInputStream.readUTF();
        this.cJ.jP = paramDataInputStream.readByte();
        this.cJ.dv = paramDataInputStream.readByte();
        this.cJ.mS = (paramDataInputStream.readByte() > 0);
        this.cJ.hN = (paramDataInputStream.readByte() > 0);
        this.cJ.ms = paramDataInputStream.readByte();
        this.cJ.ig = paramDataInputStream.readByte();
        this.cJ.id = paramDataInputStream.readByte();
        this.cJ.fV = paramDataInputStream.readShort();
        this.cJ.fU = paramDataInputStream.readShort();
        this.cJ.gg = paramDataInputStream.readByte();
        this.cJ.lO = paramDataInputStream.readInt();
        this.cJ.gD = paramDataInputStream.readByte();
        this.cJ.kb = paramDataInputStream.readUTF();
        this.cJ.lD = paramDataInputStream.readByte();
        this.cJ.fd = paramDataInputStream.readByte();
        this.cJ.eI = new byte[54];
        paramDataInputStream.readFully(this.cJ.eI);
        this.cJ.h2 = new short[8];
        for (i3 = 0; i3 < this.cJ.h2.length; i3 = (byte)(i3 + 1)) {
          this.cJ.h2[i3] = paramDataInputStream.readShort();
        }
        this.cJ.dO = paramDataInputStream.readByte();
        if (this.cJ.dO >= 0) {
          this.cJ.bm = paramDataInputStream.readUTF();
        }
        this.cJ.e3 = 1;
        this.cJ.jdField_int = 0;
        this.cJ.jdField_do = -43;
        break;
      case 4101: 
        i3 = paramDataInputStream.readByte();
        if (i3 == 1)
        {
          this.cJ.bD = new ag(this);
          this.cJ.bD.jdMethod_if(this.b0);
          this.cJ.bD.O = this.cJ.b5;
          this.cJ.hD = this.cJ.b5;
          this.cJ.bD.fp = 0;
          this.cJ.bD.T = false;
          this.cJ.bD.ao = false;
          this.cJ.bD.hU = false;
          this.cJ.bD.a4 = 0;
          this.cJ.bD.jdMethod_void(paramDataInputStream.readByte());
          this.cJ.bD.m(paramDataInputStream.readByte());
          this.cJ.bD.fa = (paramDataInputStream.readByte() > 0);
          this.cJ.bD.g4 = (paramDataInputStream.readByte() > 0);
          a(this.cJ.bD, paramDataInputStream.readByte());
          this.cJ.bD.hP = paramDataInputStream.readByte();
          this.cJ.bD.hO = paramDataInputStream.readByte();
          this.cJ.bD.aP = paramDataInputStream.readShort();
          this.cJ.bD.aM = paramDataInputStream.readShort();
          this.cJ.bD.dT = this.cJ.bD.aP;
          this.cJ.bD.dS = this.cJ.bD.aM;
          this.cJ.bD.g((byte)0);
          this.cJ.bD.eP = null;
          this.cJ.bD.X();
          this.cJ.bD.he = (paramDataInputStream.readByte() != 0);
          this.cJ.bD.fL = paramDataInputStream.readInt();
          this.cJ.bD.fx = paramDataInputStream.readByte();
          this.cJ.bD.es = paramDataInputStream.readUTF();
          this.cJ.bD.fj = paramDataInputStream.readByte();
          this.cJ.bD.dU = (paramDataInputStream.readByte() != 0);
          this.cJ.bD.gQ = false;
          this.cJ.bD.gk = false;
          this.cJ.bD.h4 = false;
          byte[] arrayOfByte = new byte[54];
          paramDataInputStream.readFully(arrayOfByte);
          short[] arrayOfShort = new short[a.ad];
          int[] arrayOfInt = new int[a.ad];
          for (int i4 = 0; i4 < arrayOfShort.length; i4 = (byte)(i4 + 1))
          {
            arrayOfShort[i4] = paramDataInputStream.readShort();
            arrayOfInt[i4] = a3.a(arrayOfShort[i4], a.C);
          }
          this.cJ.bD.eN = paramDataInputStream.readByte();
          if (this.cJ.bD.eN >= 0) {
            this.cJ.bD.eB = paramDataInputStream.readUTF();
          }
          this.cJ.gj = arrayOfShort;
          this.cJ.hc = arrayOfByte;
          this.cJ.bD.a7 = arrayOfShort;
          this.cJ.bD.H = arrayOfInt;
          this.cJ.bD.a(arrayOfByte);
          this.cJ.bD.g((byte)0);
          this.cJ.jdField_do = 0;
          this.cZ.jdMethod_if((byte)16, this.cZ.a((byte)20));
          this.cJ.e7 = true;
          this.cJ.eE = 0;
          this.cJ.ly = 10;
        }
        else
        {
          this.cJ.e7 = false;
          this.cJ.kg = -1;
          this.cJ.hD = null;
          this.cJ.bD = null;
          this.cJ.a(paramDataInputStream.readUTF(), (short)0, false, 9999);
          return;
        }
        break;
      }
    }
    catch (Exception localException) {}
  }
  
  public void b()
  {
    switch (this.cJ.jdField_do)
    {
    case -44: 
      k("请稍候...");
      if (this.cJ.jdField_int > 60) {
        this.cJ.jdField_do = 0;
      }
      break;
    case -43: 
      this.cJ.E();
      this.cJ.a("接受" + this.cJ.cw + "决斗?(决斗金" + this.cJ.bF + ")", "接受", "拒绝");
      if (this.cJ.jdField_int > 140)
      {
        this.cJ.e3 = 1;
        this.cJ.jdMethod_if(5);
      }
      break;
    case -42: 
      this.cJ.E();
      this.cJ.a("确定发起决斗?", "确定", "取消");
      break;
    case -40: 
      this.cJ.E();
      this.d9.a();
      x();
      c();
    }
  }
  
  public void jdMethod_new(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      if (i1 == 0)
      {
        String str = paramDataInputStream.readUTF();
        byte[] arrayOfByte = new byte[54];
        paramDataInputStream.readFully(arrayOfByte);
        if (this.jdField_try < f0)
        {
          this.b7[this.jdField_try] = new a3(this, null);
          this.b7[this.jdField_try].O = str;
          this.b7[this.jdField_try].a(arrayOfByte);
          if (this.aG.jdMethod_int(4011))
          {
            this.aG.jdMethod_for(this.b7[this.jdField_try].a((byte)0));
            this.aG.jdMethod_if();
          }
          this.jdField_try = ((byte)(this.jdField_try + 1));
          if (this.cZ.eY != null)
          {
            ((ar)this.cZ.eY).cm = false;
            ((ar)this.cZ.eY).df = false;
            this.cZ.eY = null;
          }
          this.cJ.jdMethod_do("诱捕到" + str + ".");
          this.cZ.d();
        }
        else
        {
          this.cJ.jdMethod_do("诱捕" + str + "失败,你没有足够的空间存放该幼体");
          this.cZ.eY = null;
          this.cZ.d();
        }
      }
      else if (this.cZ.a4 == 15)
      {
        this.cZ.eY = null;
      }
    }
    catch (Exception localException) {}
  }
  
  public void y()
  {
    switch (this.cJ.jdField_do)
    {
    case -67: 
      this.cJ.a("确定唤醒?", "是", "否");
      break;
    case -68: 
      this.cJ.a("封印所选择的宠物?", "是", "否");
      break;
    case -69: 
    case -66: 
    case -65: 
      this.cJ.E();
      jdMethod_case();
      x();
      c();
      break;
    case -63: 
      this.cJ.a("确定舍弃?", "是", "否");
      break;
    case -62: 
    case -61: 
      this.a4.jdMethod_do();
      break;
    case -60: 
    case -59: 
    case -58: 
      this.di.jdMethod_if();
      break;
    case -57: 
      this.cJ.E();
      s();
      this.cJ.a("确定开始进化?", "是", "否");
      break;
    case -56: 
      this.cJ.E();
      s();
      this.d9.a();
      break;
    case -55: 
      this.cJ.E();
      s();
      if (this.cJ.dx > 0) {
        x();
      }
      c();
      break;
    case -53: 
      this.cJ.E();
      s();
      this.d9.a();
      break;
    case -54: 
      this.cJ.E();
      s();
      this.cJ.a("确定喂养?", "是", "否");
      break;
    case -52: 
      this.cJ.E();
      s();
      if (this.cJ.dx > 0) {
        x();
      }
      c();
      break;
    case -35: 
    case -34: 
      this.cJ.E();
      jdMethod_case();
      if (this.cJ.jdField_do == -35)
      {
        a(22 + this.cJ.bf * 20 + 20, 2, this.cJ.gd, this.cJ.c9);
      }
      else
      {
        x();
        c();
      }
      break;
    }
  }
  
  public int a(byte paramByte1, byte paramByte2)
  {
    return Math.max(1, (paramByte1 * paramByte1 * paramByte1 * paramByte1 + 2 * (paramByte1 + 1) * (paramByte1 + 1)) / 10) * (10 + paramByte2) / 10;
  }
  
  public boolean jdMethod_if(a3 parama3, int paramInt)
  {
    int i1 = a(parama3);
    int i2 = (byte)parama3.a((byte)48);
    switch (paramInt)
    {
    case 0: 
      if ((i1 == 0) && ((i2 == 0) || (i2 == 2))) {
        return true;
      }
      break;
    case 1: 
      if ((i1 == 1) && ((i2 == 0) || (i2 == 2))) {
        return true;
      }
      break;
    case 2: 
      if ((i1 == 0) && ((i2 == 1) || (i2 == 2))) {
        return true;
      }
      break;
    case 3: 
      if ((i1 == 1) && ((i2 == 1) || (i2 == 2))) {
        return true;
      }
      break;
    case 4: 
      if ((i1 == 2) && ((i2 == 0) || (i2 == 2))) {
        return true;
      }
      break;
    case 5: 
      if ((i1 == 2) && ((i2 == 1) || (i2 == 2))) {
        return true;
      }
      break;
    }
    return false;
  }
  
  public int a(a3 parama3, int paramInt)
  {
    int i1 = a(parama3);
    if (i1 == 2) {
      return a.ac;
    }
    byte b10 = (byte)parama3.a((byte)40);
    int i2 = 0;
    switch (paramInt)
    {
    case 0: 
      if (jdMethod_if(parama3, paramInt)) {
        i2 = (short)parama3.a((byte)28);
      }
      break;
    case 1: 
      if (jdMethod_if(parama3, paramInt)) {
        i2 = (short)parama3.a((byte)30);
      }
      break;
    case 2: 
      if (jdMethod_if(parama3, paramInt)) {
        i2 = (short)parama3.a((byte)32);
      }
      break;
    case 3: 
      if (jdMethod_if(parama3, paramInt)) {
        i2 = (short)parama3.a((byte)34);
      }
      break;
    }
    int i3 = p(b10);
    i2 = (short)(i2 * i3 / a.n);
    return Math.max(a.char, i2 / a.C);
  }
  
  public byte p(byte paramByte)
  {
    byte b10 = 0;
    if (paramByte == 0) {
      b10 = 0;
    } else if (paramByte < 30) {
      b10 = 5;
    } else if (paramByte <= 100) {
      b10 = 10;
    }
    return b10;
  }
  
  public void L()
  {
    for (int i1 = 0; i1 < this.jdField_try - 1; i1 = (byte)(i1 + 1)) {
      for (int i2 = (byte)(i1 + 1); i2 < this.jdField_try; i2 = (byte)(i2 + 1)) {
        if (this.b7[i1].a((byte)0) > this.b7[i2].a((byte)0))
        {
          a3 locala3 = this.b7[i1];
          this.b7[i1] = this.b7[i2];
          this.b7[i2] = locala3;
        }
      }
    }
  }
  
  public byte jdMethod_if(a3 parama3)
  {
    int i1 = (byte)parama3.a((byte)36);
    if (i1 > 2) {
      i1 = (byte)(2 + i1 / 3);
    }
    return (byte)(parama3.a((byte)38) * 5 + i1);
  }
  
  public byte a(a3 parama3)
  {
    byte b10 = (byte)parama3.a((byte)36);
    if (b10 <= 2) {
      return b10;
    }
    return (byte)(b10 % 3);
  }
  
  public void a(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2, String paramString, byte paramByte3)
  {
    if (paramByte2 < 0) {
      return;
    }
    int i1 = 20;
    int i2 = paramShort1;
    int i3 = paramShort2;
    if (paramByte1 == 1) {
      i2 = (short)(i2 - (i1 + 10));
    } else {
      i2 = (short)(i2 + (20 + i1));
    }
    a(paramString, i2 + i1 / 2 - ag.hF, i3 - 20 - ag.hE, 17, gh);
  }
  
  public void a(short paramShort1, short paramShort2, byte paramByte1, byte paramByte2)
  {
    if (paramByte2 < 0) {
      return;
    }
    int i1 = 20;
    int i2 = paramShort1;
    int i3 = paramShort2;
    if (paramByte1 == 1) {
      i2 = (short)(i2 - (i1 + 10));
    } else {
      i2 = (short)(i2 + (20 + i1 + 10));
    }
    if (paramByte2 > this.dS.length - 1) {
      return;
    }
    this.c0.a(i2 - ag.hF, i3 - ag.hE, this.a2, this.dS[paramByte2], paramByte1 == 3 ? 2 : 0);
  }
  
  public void jdMethod_if(a3 parama31, a3 parama32)
  {
    jdMethod_do(parama31, parama32);
    parama31.aP = parama31.a2;
    parama31.aM = parama31.a1;
  }
  
  public void jdMethod_do(a3 parama31, a3 parama32)
  {
    int i1 = 20;
    int i2 = parama32.aP;
    int i3 = parama32.aM;
    if (parama32.au == 3) {
      i2 = (short)(i2 + 30);
    } else {
      i2 = (short)(i2 - (i1 + 10));
    }
    parama31.a2 = ((short)(i2 + ((g.dD != 3) && (g.dD != 0) && ((parama32.a4 == 3) || (parama32.a4 == 2)) ? jdMethod_if(-4, 4) : 0)));
    parama31.a1 = ((short)(i3 + ((g.dD != 3) && (g.dD != 0) && ((parama32.a4 == 3) || (parama32.a4 == 2)) ? jdMethod_if(-2, 2) : 0)));
  }
  
  public void jdMethod_char()
  {
    this.bh = null;
    this.aB = null;
    this.n = null;
    this.bh = new int[0];
    this.aB = new String[0];
    this.n = new byte[0];
  }
  
  public void a(int paramInt, String paramString, byte paramByte)
  {
    if ((paramInt < 0) || (paramString == null)) {
      return;
    }
    for (int i1 = 0; i1 < this.bh.length; i1 = (byte)(i1 + 1)) {
      if (paramInt == this.bh[i1])
      {
        if (paramByte != this.n[i1]) {
          this.n[i1] = paramByte;
        }
        return;
      }
    }
    int[] arrayOfInt = new int[this.bh.length + 1];
    String[] arrayOfString = new String[this.bh.length + 1];
    byte[] arrayOfByte = new byte[this.bh.length + 1];
    System.arraycopy(this.bh, 0, arrayOfInt, 0, this.bh.length);
    System.arraycopy(this.aB, 0, arrayOfString, 0, this.aB.length);
    System.arraycopy(this.n, 0, arrayOfByte, 0, this.n.length);
    arrayOfInt[(arrayOfInt.length - 1)] = paramInt;
    arrayOfString[(arrayOfString.length - 1)] = paramString;
    arrayOfByte[(arrayOfByte.length - 1)] = paramByte;
    this.bh = arrayOfInt;
    this.aB = arrayOfString;
    this.n = arrayOfByte;
    arrayOfInt = null;
    arrayOfString = null;
    arrayOfByte = null;
  }
  
  public String jdMethod_if(int paramInt)
  {
    if (paramInt < 0) {
      return null;
    }
    for (int i1 = 0; i1 < this.bh.length; i1 = (byte)(i1 + 1)) {
      if (paramInt == this.bh[i1]) {
        return this.aB[i1];
      }
    }
    return null;
  }
  
  public byte jdMethod_try(int paramInt)
  {
    if (paramInt < 0) {
      return 0;
    }
    for (int i1 = 0; i1 < this.bh.length; i1 = (byte)(i1 + 1)) {
      if (paramInt == this.bh[i1]) {
        return (byte)Math.max(0, this.n[i1]);
      }
    }
    return 0;
  }
  
  public boolean jdMethod_for(String paramString)
  {
    return (paramString.toUpperCase().indexOf("GM") != -1) || (paramString.equals("系统"));
  }
  
  public void jdMethod_do(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (this.cK == null) || (this.cP == null)) {
      return;
    }
    int i1 = 16;
    for (int i2 = 0; i2 < this.cK.length; i2 = (byte)(i2 + 1)) {
      if (paramInt1 == this.cK[i2])
      {
        a(paramInt2, paramInt3, i1, i1, i2 * i1, 0, this.cP, 0);
        return;
      }
    }
  }
  
  public void q(byte paramByte)
  {
    if (this.ck == null) {
      this.ck = new ai(this);
    }
    this.ck.a(paramByte);
  }
  
  public void a(int paramInt1, int paramInt2, byte paramByte)
  {
    int i1 = -1;
    switch (paramByte)
    {
    case 17: 
      i1 = 12;
      break;
    case 16: 
      i1 = 20;
      break;
    case 15: 
      i1 = 21;
      break;
    case 14: 
      i1 = 22;
      break;
    case 13: 
      i1 = 23;
    }
    if (i1 == -1) {
      return;
    }
    a(paramInt1, paramInt2, 12, 12, i1 * 12, 0, this.aH[10], 0);
  }
  
  public static void a(Exception paramException)
  {
    paramException.toString();
  }
  
  public void jdMethod_if(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readShort();
      if = new byte[i1];
      W = new int[i1];
      for (int i2 = 0; i2 < i1; i2 = (short)(i2 + 1))
      {
        if[i2] = paramDataInputStream.readByte();
        W[i2] = paramDataInputStream.readInt();
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_int(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      bc = new String[i1];
      fk = new String[i1];
      for (int i2 = 0; i2 < i1; i2 = (byte)(i2 + 1))
      {
        bc[i2] = paramDataInputStream.readUTF();
        fk[i2] = paramDataInputStream.readUTF();
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_try(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      int i2;
      byte[] arrayOfByte;
      if (i1 > 0)
      {
        R = new String[i1];
        fT = new short[i1];
        fq = new String[i1];
        d6 = new byte[i1];
        for (i2 = 0; i2 < i1; i2 = (byte)(i2 + 1))
        {
          fT[i2] = paramDataInputStream.readShort();
          R[i2] = paramDataInputStream.readUTF();
          fq[i2] = paramDataInputStream.readUTF();
          d6[i2] = paramDataInputStream.readByte();
        }
        i2 = paramDataInputStream.readShort();
        arrayOfByte = new byte[i2];
        paramDataInputStream.readFully(arrayOfByte);
        fy = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      }
      i1 = paramDataInputStream.readByte();
      if (i1 > 0)
      {
        a0 = new String[i1];
        b4 = new String[i1];
        C = new short[i1];
        cI = new byte[i1][2][2];
        fZ = new int[i1][5];
        for (i2 = 0; i2 < i1; i2 = (byte)(i2 + 1))
        {
          a0[i2] = paramDataInputStream.readUTF();
          b4[i2] = paramDataInputStream.readUTF();
          cI[i2][0][0] = paramDataInputStream.readByte();
          cI[i2][0][1] = paramDataInputStream.readByte();
          cI[i2][1][0] = paramDataInputStream.readByte();
          cI[i2][1][1] = paramDataInputStream.readByte();
          C[i2] = paramDataInputStream.readShort();
        }
        i2 = paramDataInputStream.readShort();
        arrayOfByte = new byte[i2];
        paramDataInputStream.readFully(arrayOfByte);
        dG = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
        a5 = new x(this);
        a5.a(paramDataInputStream, false);
        for (int i3 = 0; i3 < i1; i3 = (byte)(i3 + 1))
        {
          fZ[i3][1] = -1;
          a5.a(i3, 0, fZ[i3]);
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void a(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readByte();
      if (i1 > 0)
      {
        by = new String[i1];
        el = new short[i1];
        aY = new String[i1];
        fc = new short[i1];
        for (int i2 = 0; i2 < i1; i2 = (byte)(i2 + 1))
        {
          el[i2] = paramDataInputStream.readShort();
          by[i2] = paramDataInputStream.readUTF();
          aY[i2] = paramDataInputStream.readUTF();
          fc[i2] = paramDataInputStream.readShort();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_for(DataInputStream paramDataInputStream)
  {
    try
    {
      V = new int[''];
      for (int i1 = 0; i1 < 128; i1 = (short)(i1 + 1)) {
        V[i1] = paramDataInputStream.readInt();
      }
    }
    catch (Exception localException) {}
  }
  
  public void jdMethod_char(DataInputStream paramDataInputStream)
  {
    try
    {
      d3 = new long[e5 * 3 / 2];
      for (int i1 = 0; i1 < e5 * 3 / 2; i1++) {
        d3[i1] = paramDataInputStream.readLong();
      }
      cx = new byte[e5];
      for (i1 = 0; i1 < e5; i1++) {
        cx[i1] = paramDataInputStream.readByte();
      }
    }
    catch (Exception localException)
    {
      a(localException);
      localException.printStackTrace();
    }
  }
  

  //继承定时任务
  //可能是地图存档数据完整性 验证
  //找到了？
  private class a
    extends TimerTask
  {
    private a() {}
    
    public void run()
    {
      try
      {
        if (h.fv) {
          return;
        }
        h.access$102(true);
        h.this.repaint();
        h.this.serviceRepaints();
        Threak.sleep(20L);
        if (h.bi)
        {
          h.this.fG.destroyApp(true);
          h.this.fG.notifyDestroyed();
        }
      }
      catch (Exception localException) {}
    }
    
    a(h.0 param0)
    {
      this();
    }
  }
}


/* Location:              D:\OneDrive\游戏\客户端SOT觉醒者 - 副本.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */