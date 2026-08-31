.class public final LP/O0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lq5/h;

.field public final synthetic t:LP5/h;


# direct methods
.method public constructor <init>(Lq5/h;LP5/h;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/O0;->s:Lq5/h;

    .line 2
    .line 3
    iput-object p2, p0, LP/O0;->t:LP5/h;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, LP/O0;

    .line 2
    .line 3
    iget-object v1, p0, LP/O0;->s:Lq5/h;

    .line 4
    .line 5
    iget-object v2, p0, LP/O0;->t:LP5/h;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LP/O0;-><init>(Lq5/h;LP5/h;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LP/O0;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/k0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP/O0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP/O0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP/O0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LP/O0;->q:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LP/O0;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LP/k0;

    .line 30
    .line 31
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 32
    .line 33
    iget-object v3, p0, LP/O0;->s:Lq5/h;

    .line 34
    .line 35
    invoke-static {v3, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v4, p0, LP/O0;->t:LP5/h;

    .line 40
    .line 41
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    new-instance v0, LP/M0;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p1, v1}, LP/M0;-><init>(LP/k0;I)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, LP/O0;->q:I

    .line 52
    .line 53
    invoke-interface {v4, v0, p0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v5, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    new-instance v0, LP/N0;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {v0, v4, p1, v2}, LP/N0;-><init>(LP5/h;LP/k0;Lq5/c;)V

    .line 64
    .line 65
    .line 66
    iput v1, p0, LP/O0;->q:I

    .line 67
    .line 68
    invoke-static {v3, v0, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v5, :cond_4

    .line 73
    .line 74
    :goto_1
    return-object v5

    .line 75
    :cond_4
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 76
    .line 77
    return-object p1
.end method
