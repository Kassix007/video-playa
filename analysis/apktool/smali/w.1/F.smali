.class public final Lw/F;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/H;

.field public final synthetic t:J


# direct methods
.method public constructor <init>(Lw/H;JLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/F;->s:Lw/H;

    .line 2
    .line 3
    iput-wide p2, p0, Lw/F;->t:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, Lw/F;

    .line 2
    .line 3
    iget-object v1, p0, Lw/F;->s:Lw/H;

    .line 4
    .line 5
    iget-wide v2, p0, Lw/F;->t:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Lw/F;-><init>(Lw/H;JLq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/F;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lw/F;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/F;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/F;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lw/F;->q:I

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
    iget-object p1, p0, Lw/F;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    iget-object v0, p0, Lw/F;->s:Lw/H;

    .line 28
    .line 29
    iget-object v0, v0, Lw/H;->R:LB5/f;

    .line 30
    .line 31
    new-instance v2, Li0/b;

    .line 32
    .line 33
    iget-wide v3, p0, Lw/F;->t:J

    .line 34
    .line 35
    invoke-direct {v2, v3, v4}, Li0/b;-><init>(J)V

    .line 36
    .line 37
    .line 38
    iput v1, p0, Lw/F;->q:I

    .line 39
    .line 40
    invoke-interface {v0, p1, v2, p0}, LB5/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 45
    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 50
    .line 51
    return-object p1
.end method
