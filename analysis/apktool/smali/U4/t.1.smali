.class public final synthetic LU4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:Lj5/b;

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(Lj5/b;LR4/k1;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/t;->q:Lj5/b;

    iput-object p2, p0, LU4/t;->r:LR4/k1;

    iput-object p3, p0, LU4/t;->s:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LU4/t;->q:Lj5/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/t;->s:LP/W;

    .line 7
    .line 8
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v1, p0, LU4/t;->r:LR4/k1;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, LR4/k1;->S:Lg5/h;

    .line 24
    .line 25
    iget-object v0, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, v1, LR4/k1;->S:Lg5/h;

    .line 33
    .line 34
    iput-object v2, v0, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 35
    .line 36
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object v0
.end method
