.class public final LR4/p0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LR4/s0;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/lang/String;


# direct methods
.method public constructor <init>(LR4/s0;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/p0;->r:LR4/s0;

    .line 2
    .line 3
    iput-object p2, p0, LR4/p0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LR4/p0;->t:Ljava/lang/String;

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
    new-instance p1, LR4/p0;

    .line 2
    .line 3
    iget-object v0, p0, LR4/p0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LR4/p0;->t:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, LR4/p0;->r:LR4/s0;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LR4/p0;-><init>(LR4/s0;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, LR4/p0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/p0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LR4/p0;->q:I

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
    iget-object p1, p0, LR4/p0;->s:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput v1, p0, LR4/p0;->q:I

    .line 29
    .line 30
    iget-object v0, p0, LR4/p0;->r:LR4/s0;

    .line 31
    .line 32
    iget-object v1, p0, LR4/p0;->t:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1, p0}, LR4/s0;->a(Ljava/lang/String;Ljava/lang/String;Ls5/c;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 44
    .line 45
    return-object p1
.end method
