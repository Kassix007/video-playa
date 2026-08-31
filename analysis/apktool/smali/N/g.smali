.class public final LN/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LB5/a;

.field public final synthetic t:LB5/e;


# direct methods
.method public constructor <init>(LB5/a;LB5/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/g;->s:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, LN/g;->t:LB5/e;

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
    new-instance v0, LN/g;

    .line 2
    .line 3
    iget-object v1, p0, LN/g;->s:LB5/a;

    .line 4
    .line 5
    iget-object v2, p0, LN/g;->t:LB5/e;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN/g;-><init>(LB5/a;LB5/e;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LN/g;->r:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LN/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LN/g;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
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
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LN/g;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, LP/Q0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    iget-object v4, p0, LN/g;->s:LB5/a;

    .line 36
    .line 37
    invoke-direct {v2, v4, v3}, LP/Q0;-><init>(LB5/a;Lq5/c;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lu2/m;

    .line 41
    .line 42
    invoke-direct {v3, v2}, Lu2/m;-><init>(LB5/e;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, LN/f;

    .line 46
    .line 47
    iget-object v4, p0, LN/g;->t:LB5/e;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct {v2, v0, p1, v4, v5}, LN/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    iput v1, p0, LN/g;->q:I

    .line 54
    .line 55
    invoke-virtual {v3, v2, p0}, Lu2/m;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 60
    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 65
    .line 66
    return-object p1
.end method
