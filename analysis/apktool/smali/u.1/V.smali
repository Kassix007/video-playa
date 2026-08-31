.class public final Lu/V;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:I

.field public final synthetic r:Lu/v0;

.field public final synthetic s:Lu/d0;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V
    .locals 0

    .line 1
    iput-object p4, p0, Lu/V;->r:Lu/v0;

    .line 2
    .line 3
    iput-object p3, p0, Lu/V;->s:Lu/d0;

    .line 4
    .line 5
    iput-object p1, p0, Lu/V;->t:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, Lu/V;

    .line 2
    .line 3
    iget-object v1, p0, Lu/V;->s:Lu/d0;

    .line 4
    .line 5
    iget-object v2, p0, Lu/V;->t:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lu/V;->r:Lu/v0;

    .line 8
    .line 9
    invoke-direct {v0, v2, p1, v1, v3}, Lu/V;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu/V;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lu/V;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lu/V;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lu/V;->q:I

    .line 2
    .line 3
    iget-object v1, p0, Lu/V;->r:Lu/v0;

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
    new-instance p1, Lu/U;

    .line 26
    .line 27
    iget-object v0, p0, Lu/V;->t:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    iget-object v4, p0, Lu/V;->s:Lu/d0;

    .line 31
    .line 32
    invoke-direct {p1, v0, v3, v4, v1}, Lu/U;-><init>(Ljava/lang/Object;Lq5/c;Lu/d0;Lu/v0;)V

    .line 33
    .line 34
    .line 35
    iput v2, p0, Lu/V;->q:I

    .line 36
    .line 37
    invoke-static {p1, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 42
    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lu/v0;->i()V

    .line 47
    .line 48
    .line 49
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 50
    .line 51
    return-object p1
.end method
