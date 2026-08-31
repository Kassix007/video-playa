.class public final synthetic Lg5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/k1;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/j;->q:LR4/k1;

    iput-object p2, p0, Lg5/j;->r:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lt/g;

    .line 2
    .line 3
    check-cast p2, LT1/d;

    .line 4
    .line 5
    move-object v4, p3

    .line 6
    check-cast v4, LP/o;

    .line 7
    .line 8
    check-cast p4, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string p3, "$this$composable"

    .line 14
    .line 15
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "it"

    .line 19
    .line 20
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lg5/j;->q:LR4/k1;

    .line 24
    .line 25
    iget-object p1, v0, LR4/k1;->d:LR4/i;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, LR4/i;->c:LR4/Y0;

    .line 30
    .line 31
    :goto_0
    move-object v1, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v2, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 36
    .line 37
    invoke-virtual {v4, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v4}, LP/o;->H()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    sget-object p1, LP/k;->a:LP/S;

    .line 48
    .line 49
    if-ne p2, p1, :cond_2

    .line 50
    .line 51
    :cond_1
    new-instance p2, LU4/f;

    .line 52
    .line 53
    const/4 p1, 0x4

    .line 54
    iget-object p3, p0, Lg5/j;->r:LP/W;

    .line 55
    .line 56
    invoke-direct {p2, v0, p3, p1}, LU4/f;-><init>(LR4/k1;LP/W;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    move-object v3, p2

    .line 63
    check-cast v3, LB5/c;

    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    invoke-static/range {v0 .. v5}, LC3/a;->h(LR4/k1;LR4/Y0;Lcom/web2native/MainActivity;LB5/c;LP/o;I)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 70
    .line 71
    return-object p1
.end method
