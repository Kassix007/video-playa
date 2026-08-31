.class public final LF/L;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LF/e;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(LF/e;ILq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/L;->r:LF/e;

    .line 2
    .line 3
    iput p2, p0, LF/L;->s:I

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
    .locals 2

    .line 1
    new-instance p1, LF/L;

    .line 2
    .line 3
    iget-object v0, p0, LF/L;->r:LF/e;

    .line 4
    .line 5
    iget v1, p0, LF/L;->s:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LF/L;-><init>(LF/e;ILq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/i0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LF/L;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/L;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LF/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LF/L;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LF/L;->r:LF/e;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput v3, p0, LF/L;->q:I

    .line 28
    .line 29
    iget-object p1, v2, LF/N;->w:LE/e;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, LE/e;->f(Ls5/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 36
    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object p1, v1

    .line 41
    :goto_0
    if-ne p1, v0, :cond_3

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 45
    float-to-double v4, p1

    .line 46
    const-wide/high16 v6, -0x4020000000000000L    # -0.5

    .line 47
    .line 48
    cmpg-double v0, v6, v4

    .line 49
    .line 50
    if-gtz v0, :cond_4

    .line 51
    .line 52
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 53
    .line 54
    cmpg-double v0, v4, v6

    .line 55
    .line 56
    if-gtz v0, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const-string v0, "pageOffsetFraction 0.0 is not within the range -0.5 to 0.5"

    .line 60
    .line 61
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    iget v0, p0, LF/L;->s:I

    .line 65
    .line 66
    invoke-virtual {v2, v0}, LF/N;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v2, v0, p1, v3}, LF/N;->s(IFZ)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method
