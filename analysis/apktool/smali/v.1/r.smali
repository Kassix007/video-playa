.class public final Lv/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# static fields
.field public static final r:Lv/r;

.field public static final s:Lv/r;

.field public static final t:Lv/r;

.field public static final u:Lv/r;


# instance fields
.field public final synthetic q:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lv/r;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lv/r;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv/r;->r:Lv/r;

    .line 9
    .line 10
    new-instance v0, Lv/r;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lv/r;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lv/r;->s:Lv/r;

    .line 17
    .line 18
    new-instance v0, Lv/r;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lv/r;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lv/r;->t:Lv/r;

    .line 25
    .line 26
    new-instance v0, Lv/r;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lv/r;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lv/r;->u:Lv/r;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lv/r;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lv/r;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, LI0/i;

    .line 9
    .line 10
    sget-object v0, LI0/e;->c:LI0/e;

    .line 11
    .line 12
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 13
    .line 14
    sget-object v2, LI0/p;->c:LI0/s;

    .line 15
    .line 16
    sget-object v3, LI0/r;->a:[LH5/k;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    aget-object v3, v3, v4

    .line 20
    .line 21
    invoke-virtual {v2, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    check-cast p1, LP/i0;

    .line 26
    .line 27
    sget v0, Lv/n;->a:I

    .line 28
    .line 29
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, LP/b;->r(LP/i0;LP/l0;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v2, v0

    .line 39
    check-cast v2, Landroid/content/Context;

    .line 40
    .line 41
    sget-object v0, LC0/t0;->h:LP/T0;

    .line 42
    .line 43
    invoke-static {p1, v0}, LP/b;->r(LP/i0;LP/l0;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v3, v0

    .line 48
    check-cast v3, LW0/c;

    .line 49
    .line 50
    sget-object v0, Lv/c0;->a:LP/z;

    .line 51
    .line 52
    invoke-static {p1, v0}, LP/b;->r(LP/i0;LP/l0;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lv/b0;

    .line 57
    .line 58
    if-nez p1, :cond_0

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v1, Lv/m;

    .line 63
    .line 64
    iget-wide v4, p1, Lv/b0;->a:J

    .line 65
    .line 66
    iget-object v6, p1, Lv/b0;->b:LA/L;

    .line 67
    .line 68
    invoke-direct/range {v1 .. v6}, Lv/m;-><init>(Landroid/content/Context;LW0/c;JLA/L;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v1

    .line 72
    :goto_0
    return-object p1

    .line 73
    :pswitch_1
    check-cast p1, Lz0/I;

    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_2
    check-cast p1, LB0/N;

    .line 77
    .line 78
    invoke-virtual {p1}, LB0/N;->a()V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
