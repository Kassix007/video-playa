.class public final Lu/e;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lu/c;

.field public final synthetic t:LP/W;

.field public final synthetic u:LP/W;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lu/c;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/e;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lu/e;->s:Lu/c;

    .line 4
    .line 5
    iput-object p3, p0, Lu/e;->t:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, Lu/e;->u:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lu/e;

    .line 2
    .line 3
    iget-object v3, p0, Lu/e;->t:LP/W;

    .line 4
    .line 5
    iget-object v4, p0, Lu/e;->u:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, Lu/e;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lu/e;->s:Lu/c;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lu/e;-><init>(Ljava/lang/Object;Lu/c;LP/W;LP/W;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lu/e;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/e;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lu/e;->q:I

    .line 2
    .line 3
    iget-object v1, p0, Lu/e;->s:Lu/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v1, Lu/c;->e:LP/f0;

    .line 26
    .line 27
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lu/e;->r:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    sget-object p1, Lu/g;->a:Lu/f0;

    .line 40
    .line 41
    iget-object p1, p0, Lu/e;->t:LP/W;

    .line 42
    .line 43
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lu/k;

    .line 48
    .line 49
    iput v2, p0, Lu/e;->q:I

    .line 50
    .line 51
    const/16 v2, 0xc

    .line 52
    .line 53
    invoke-static {v1, v0, p1, p0, v2}, Lu/c;->c(Lu/c;Ljava/lang/Object;Lu/k;Ls5/i;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 58
    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    :goto_0
    sget-object p1, Lu/g;->a:Lu/f0;

    .line 63
    .line 64
    iget-object p1, p0, Lu/e;->u:LP/W;

    .line 65
    .line 66
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, LB5/c;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Lu/c;->d()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {p1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object p1
.end method
