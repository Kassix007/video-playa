.class public final LF/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/i0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp3/z0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LF/E;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF/E;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw/i0;LF/N;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LF/E;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/E;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(F)F
    .locals 6

    .line 1
    iget v0, p0, LF/E;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF/E;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp3/z0;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, v0, Lp3/z0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lkotlin/jvm/internal/n;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v1, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object v1, v0, Lp3/z0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, LP/f0;

    .line 39
    .line 40
    cmpl-float v3, p1, v2

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x1

    .line 44
    if-lez v3, :cond_1

    .line 45
    .line 46
    move v3, v5

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v3, v4

    .line 49
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v3}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Lp3/z0;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LP/f0;

    .line 59
    .line 60
    cmpg-float v1, p1, v2

    .line 61
    .line 62
    if-gez v1, :cond_2

    .line 63
    .line 64
    move v4, v5

    .line 65
    :cond_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move v2, p1

    .line 73
    :goto_1
    return v2

    .line 74
    :pswitch_0
    iget-object v0, p0, LF/E;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lw/i0;

    .line 77
    .line 78
    invoke-interface {v0, p1}, Lw/i0;->a(F)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
