.class public abstract LM/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LM/j;->B:LM/j;

    .line 2
    .line 3
    new-instance v1, LP/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LM/L0;->a:LP/z;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lc0/m;Lj0/E;JJFFLX/e;LP/o;II)V
    .locals 1

    .line 1
    and-int/lit8 p10, p11, 0x1

    .line 2
    .line 3
    if-eqz p10, :cond_0

    .line 4
    .line 5
    sget-object p0, Lc0/j;->q:Lc0/j;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p10, p11, 0x2

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    sget-object p1, Lj0/B;->a:LO3/D;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p10, p11, 0x8

    .line 14
    .line 15
    if-eqz p10, :cond_2

    .line 16
    .line 17
    invoke-static {p2, p3, p9}, LM/k;->b(JLP/o;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p4

    .line 21
    :cond_2
    and-int/lit8 p10, p11, 0x10

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p10, :cond_3

    .line 25
    .line 26
    int-to-float p6, v0

    .line 27
    :cond_3
    and-int/lit8 p10, p11, 0x20

    .line 28
    .line 29
    if-eqz p10, :cond_4

    .line 30
    .line 31
    int-to-float p7, v0

    .line 32
    :cond_4
    sget-object p10, LM/L0;->a:LP/z;

    .line 33
    .line 34
    invoke-virtual {p9, p10}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p11

    .line 38
    check-cast p11, LW0/f;

    .line 39
    .line 40
    iget p11, p11, LW0/f;->q:F

    .line 41
    .line 42
    add-float/2addr p6, p11

    .line 43
    sget-object p11, LM/q;->a:LP/z;

    .line 44
    .line 45
    new-instance v0, Lj0/o;

    .line 46
    .line 47
    invoke-direct {v0, p4, p5}, Lj0/o;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p11, v0}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    new-instance p5, LW0/f;

    .line 55
    .line 56
    invoke-direct {p5, p6}, LW0/f;-><init>(F)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p10, p5}, LP/z;->a(Ljava/lang/Object;)LP/m0;

    .line 60
    .line 61
    .line 62
    move-result-object p5

    .line 63
    filled-new-array {p4, p5}, [LP/m0;

    .line 64
    .line 65
    .line 66
    move-result-object p10

    .line 67
    move-wide p4, p2

    .line 68
    move-object p3, p1

    .line 69
    new-instance p1, LM/b;

    .line 70
    .line 71
    move-object p2, p0

    .line 72
    invoke-direct/range {p1 .. p8}, LM/b;-><init>(Lc0/m;Lj0/E;JFFLX/e;)V

    .line 73
    .line 74
    .line 75
    const p0, -0x43a11cd

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1, p9}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const/16 p1, 0x38

    .line 83
    .line 84
    invoke-static {p10, p0, p9, p1}, LP/b;->b([LP/m0;LB5/e;LP/o;I)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
