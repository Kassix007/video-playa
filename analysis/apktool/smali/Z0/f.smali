.class public final LZ0/f;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Z

.field public final synthetic s:LZ0/j;

.field public final synthetic t:J


# direct methods
.method public constructor <init>(ZLZ0/j;JLq5/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ0/f;->r:Z

    .line 2
    .line 3
    iput-object p2, p0, LZ0/f;->s:LZ0/j;

    .line 4
    .line 5
    iput-wide p3, p0, LZ0/f;->t:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LZ0/f;

    .line 2
    .line 3
    iget-object v2, p0, LZ0/f;->s:LZ0/j;

    .line 4
    .line 5
    iget-wide v3, p0, LZ0/f;->t:J

    .line 6
    .line 7
    iget-boolean v1, p0, LZ0/f;->r:Z

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, LZ0/f;-><init>(ZLZ0/j;JLq5/c;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p1, p2}, LZ0/f;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LZ0/f;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LZ0/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LZ0/f;->q:I

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
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object v9, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p0, LZ0/f;->r:Z

    .line 32
    .line 33
    iget-object v0, p0, LZ0/f;->s:LZ0/j;

    .line 34
    .line 35
    sget-object v3, Lr5/a;->q:Lr5/a;

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    iget-object v4, v0, LZ0/j;->q:Lu0/d;

    .line 40
    .line 41
    iput v2, p0, LZ0/f;->q:I

    .line 42
    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    iget-wide v7, p0, LZ0/f;->t:J

    .line 46
    .line 47
    move-object v9, p0

    .line 48
    invoke-virtual/range {v4 .. v9}, Lu0/d;->a(JJLs5/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v3, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-object v9, p0

    .line 56
    iget-object v4, v0, LZ0/j;->q:Lu0/d;

    .line 57
    .line 58
    iput v1, v9, LZ0/f;->q:I

    .line 59
    .line 60
    iget-wide v5, v9, LZ0/f;->t:J

    .line 61
    .line 62
    const-wide/16 v7, 0x0

    .line 63
    .line 64
    invoke-virtual/range {v4 .. v9}, Lu0/d;->a(JJLs5/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v3, :cond_4

    .line 69
    .line 70
    :goto_0
    return-object v3

    .line 71
    :cond_4
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 72
    .line 73
    return-object p1
.end method
