.class public final LC0/s0;
.super LC0/a;
.source "SourceFile"


# instance fields
.field public final y:LP/f0;

.field public z:Z


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LC0/a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LC0/s0;->y:LP/f0;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic getShouldCreateCompositionOnAttachedToWindow$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(ILP/o;)V
    .locals 2

    .line 1
    const p1, 0x190bf45a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LC0/s0;->y:LP/f0;

    .line 8
    .line 9
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, LB5/e;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const p1, 0x155c14b9

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p2, v0}, LP/o;->p(Z)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const v1, 0x8f27448

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v1}, LP/o;->S(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {p1, p2, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-virtual {p2, v0}, LP/o;->p(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-class v0, LC0/s0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LC0/s0;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setContent(LB5/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/e;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LC0/s0;->z:Z

    .line 3
    .line 4
    iget-object v0, p0, LC0/s0;->y:LP/f0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LC0/a;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
