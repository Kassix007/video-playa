.class public final LU4/O;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;

.field public final synthetic s:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/O;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, LU4/O;->r:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU4/O;->s:LP/W;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LU4/O;

    .line 2
    .line 3
    iget-object v0, p0, LU4/O;->r:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, LU4/O;->s:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, LU4/O;->q:LR4/k1;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LU4/O;-><init>(LR4/k1;LP/W;LP/W;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU4/O;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/O;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/O;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/O;->r:LP/W;

    .line 5
    .line 6
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    int-to-float p1, p1

    .line 17
    iget-object v0, p0, LU4/O;->q:LR4/k1;

    .line 18
    .line 19
    iget-object v1, v0, LR4/k1;->t:Lj5/d;

    .line 20
    .line 21
    iget-object v1, v1, Lj5/d;->q:LP/c0;

    .line 22
    .line 23
    invoke-virtual {v1}, LP/c0;->e()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    const v2, 0x3fe66666    # 1.8f

    .line 29
    .line 30
    .line 31
    mul-float/2addr v1, v2

    .line 32
    sub-float/2addr p1, v1

    .line 33
    iget-object v0, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 34
    .line 35
    invoke-static {p1, v0}, LU4/a;->z(FLandroid/content/Context;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    new-instance v0, LW0/f;

    .line 40
    .line 41
    invoke-direct {v0, p1}, LW0/f;-><init>(F)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LU4/O;->s:LP/W;

    .line 45
    .line 46
    invoke-interface {p1, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 50
    .line 51
    return-object p1
.end method
