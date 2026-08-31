.class public final synthetic LU4/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LR4/k1;

.field public final synthetic c:LP/S0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LR4/k1;LP/S0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/D;->a:Landroid/content/Context;

    iput-object p2, p0, LU4/D;->b:LR4/k1;

    iput-object p3, p0, LU4/D;->c:LP/S0;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    int-to-float p2, p2

    .line 6
    iget-object p3, p0, LU4/D;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 17
    .line 18
    div-float/2addr p2, p3

    .line 19
    float-to-int p2, p2

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object p3, p0, LU4/D;->b:LR4/k1;

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, LU4/D;->c:LP/S0;

    .line 29
    .line 30
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p3, LR4/k1;->t:Lj5/d;

    .line 43
    .line 44
    iget-object p3, p1, Lj5/d;->r:LP/c0;

    .line 45
    .line 46
    invoke-virtual {p3, p2}, LP/c0;->f(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lj5/d;->c()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-object p1, p3, LR4/k1;->R:LR4/V;

    .line 54
    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iget-object p1, p3, LR4/k1;->t:Lj5/d;

    .line 58
    .line 59
    iget-object p1, p1, Lj5/d;->v:LP5/S;

    .line 60
    .line 61
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 p3, 0x0

    .line 69
    invoke-virtual {p1, p3, p2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :cond_2
    iget-object p1, p3, LR4/k1;->t:Lj5/d;

    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    iget-object p3, p1, Lj5/d;->r:LP/c0;

    .line 77
    .line 78
    invoke-virtual {p3, p2}, LP/c0;->f(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lj5/d;->c()V

    .line 82
    .line 83
    .line 84
    return-void
.end method
