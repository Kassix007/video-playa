.class public final LN/p;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public q:I

.field public final synthetic r:LB0/o;

.field public final synthetic s:Lw/E;


# direct methods
.method public constructor <init>(LB0/o;Lw/E;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/p;->r:LB0/o;

    .line 2
    .line 3
    iput-object p2, p0, LN/p;->s:Lw/E;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LN/o;

    .line 2
    .line 3
    check-cast p2, LN/y;

    .line 4
    .line 5
    check-cast p3, Lq5/c;

    .line 6
    .line 7
    new-instance p1, LN/p;

    .line 8
    .line 9
    iget-object p2, p0, LN/p;->r:LB0/o;

    .line 10
    .line 11
    iget-object v0, p0, LN/p;->s:Lw/E;

    .line 12
    .line 13
    invoke-direct {p1, p2, v0, p3}, LN/p;-><init>(LB0/o;Lw/E;Lq5/c;)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LN/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LN/p;->q:I

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
    iget-object p1, p0, LN/p;->r:LB0/o;

    .line 24
    .line 25
    iget-object p1, p1, LB0/o;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LN/q;

    .line 28
    .line 29
    iput v1, p0, LN/p;->q:I

    .line 30
    .line 31
    iget-object v0, p0, LN/p;->s:Lw/E;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p0}, Lw/E;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 43
    .line 44
    return-object p1
.end method
