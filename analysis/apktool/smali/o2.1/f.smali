.class public final Lo2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo2/m;


# direct methods
.method public synthetic constructor <init>(Lo2/m;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo2/f;->a:I

    iput-object p1, p0, Lo2/f;->b:Lo2/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 1
    iget p1, p0, Lo2/f;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lo2/g;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iget-object v1, p0, Lo2/f;->b:Lo2/m;

    .line 10
    .line 11
    invoke-direct {p1, v1, v0}, Lo2/g;-><init>(Lo2/m;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v1, Lo2/m;->R:Lo2/g;

    .line 15
    .line 16
    const-wide/16 v2, 0x96

    .line 17
    .line 18
    invoke-virtual {p1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v1, Lo2/m;->J:Lo2/a;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Lo2/a;->q:Landroid/view/animation/Animation$AnimationListener;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, Lo2/m;->J:Lo2/a;

    .line 30
    .line 31
    iget-object v0, v1, Lo2/m;->R:Lo2/g;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lo2/f;->b:Lo2/m;

    .line 38
    .line 39
    check-cast p1, LR4/X1;

    .line 40
    .line 41
    iget-boolean v0, p1, Lo2/m;->s:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p1, Lo2/m;->P:Lo2/e;

    .line 46
    .line 47
    const/16 v1, 0xff

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lo2/e;->setAlpha(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, Lo2/m;->P:Lo2/e;

    .line 53
    .line 54
    invoke-virtual {v0}, Lo2/e;->start()V

    .line 55
    .line 56
    .line 57
    iget-boolean v0, p1, Lo2/m;->U:Z

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget-object v0, p1, Lo2/m;->r:Lo2/k;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    invoke-interface {v0}, Lo2/k;->a()V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v0, p1, Lo2/m;->J:Lo2/a;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iput v0, p1, Lo2/m;->D:I

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p1}, Lo2/m;->l()V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget p1, p0, Lo2/f;->a:I

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget p1, p0, Lo2/f;->a:I

    return-void
.end method
