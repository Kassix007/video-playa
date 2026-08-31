.class public final synthetic LW4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:LR4/k1;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(LR4/k1;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW4/a;->a:LR4/k1;

    iput-object p2, p0, LW4/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/4 p3, 0x0

    .line 9
    iget-object p4, p0, LW4/a;->a:LR4/k1;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    iget-object p2, p4, LR4/k1;->R:LR4/V;

    .line 14
    .line 15
    iget-object p4, p4, LR4/k1;->t:Lj5/d;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p1, p1

    .line 24
    iget-object p2, p0, LW4/a;->b:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    div-float/2addr p1, p2

    .line 37
    float-to-int p1, p1

    .line 38
    iget-object p2, p4, Lj5/d;->v:LP5/S;

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    invoke-virtual {p2, p3, p1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object p1, p4, Lj5/d;->q:LP/c0;

    .line 53
    .line 54
    invoke-virtual {p1, p3}, LP/c0;->f(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p4}, Lj5/d;->c()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    iget-object p1, p4, LR4/k1;->t:Lj5/d;

    .line 62
    .line 63
    iget-object p2, p1, Lj5/d;->q:LP/c0;

    .line 64
    .line 65
    invoke-virtual {p2, p3}, LP/c0;->f(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lj5/d;->c()V

    .line 69
    .line 70
    .line 71
    return-void
.end method
