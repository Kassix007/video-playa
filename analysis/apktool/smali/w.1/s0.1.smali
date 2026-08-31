.class public final Lw/s0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/A;

.field public final synthetic t:Lw/H0;


# direct methods
.method public constructor <init>(Lw/A;Lw/H0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/s0;->s:Lw/A;

    .line 2
    .line 3
    iput-object p2, p0, Lw/s0;->t:Lw/H0;

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
    new-instance v0, Lw/s0;

    .line 2
    .line 3
    iget-object v1, p0, Lw/s0;->s:Lw/A;

    .line 4
    .line 5
    iget-object v2, p0, Lw/s0;->t:Lw/H0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lw/s0;-><init>(Lw/A;Lw/H0;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/s0;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/E0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/s0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/s0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lw/s0;->q:I

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
    iget-object p1, p0, Lw/s0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lw/E0;

    .line 26
    .line 27
    new-instance v0, Lv/u;

    .line 28
    .line 29
    iget-object v2, p0, Lw/s0;->t:Lw/H0;

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    invoke-direct {v0, v3, p1, v2}, Lv/u;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput v1, p0, Lw/s0;->q:I

    .line 36
    .line 37
    iget-object p1, p0, Lw/s0;->s:Lw/A;

    .line 38
    .line 39
    invoke-virtual {p1, v0, p0}, Lw/A;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 44
    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 49
    .line 50
    return-object p1
.end method
