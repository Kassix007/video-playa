.class public final synthetic LU4/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/k1;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/U;->q:LR4/k1;

    iput-object p2, p0, LU4/U;->r:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LA/u;

    .line 2
    .line 3
    check-cast p2, LP/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const-string v0, "$this$ElevatedCard"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v1

    .line 27
    :goto_0
    and-int/2addr p3, v2

    .line 28
    invoke-virtual {p2, p3, p1}, LP/o;->K(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, LU4/U;->r:LP/W;

    .line 35
    .line 36
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lc0/m;

    .line 41
    .line 42
    iget-object p3, p0, LU4/U;->q:LR4/k1;

    .line 43
    .line 44
    invoke-static {p3, p1, p2, v1}, LU4/a;->b(LR4/k1;Lc0/m;LP/o;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p2}, LP/o;->N()V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 52
    .line 53
    return-object p1
.end method
