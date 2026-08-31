.class public abstract LQ1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK2/j;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, LK2/j;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LP/z;

    .line 9
    .line 10
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, LQ1/a;->a:LP/z;

    .line 14
    .line 15
    return-void
.end method

.method public static a(LP/o;)Landroidx/lifecycle/l0;
    .locals 3

    .line 1
    sget-object v0, LQ1/a;->a:LP/z;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/l0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const v0, 0x4b1d16e9    # 1.0295017E7f

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, LP/o;->S(I)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    invoke-static {v0}, Landroidx/lifecycle/X;->e(Landroid/view/View;)Landroidx/lifecycle/l0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-virtual {p0, v1}, LP/o;->p(Z)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    const v2, 0x4b1d128d    # 1.0293901E7f

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, LP/o;->S(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0
.end method
