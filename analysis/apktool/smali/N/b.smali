.class public final LN/b;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public q:I

.field public synthetic r:LN/o;

.field public synthetic s:LN/y;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:LN/r;

.field public final synthetic v:F


# direct methods
.method public constructor <init>(LN/r;FLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/b;->u:LN/r;

    .line 2
    .line 3
    iput p2, p0, LN/b;->v:F

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LN/o;

    .line 2
    .line 3
    check-cast p2, LN/y;

    .line 4
    .line 5
    check-cast p4, Lq5/c;

    .line 6
    .line 7
    new-instance v0, LN/b;

    .line 8
    .line 9
    iget-object v1, p0, LN/b;->u:LN/r;

    .line 10
    .line 11
    iget v2, p0, LN/b;->v:F

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p4}, LN/b;-><init>(LN/r;FLq5/c;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, LN/b;->r:LN/o;

    .line 17
    .line 18
    iput-object p2, v0, LN/b;->s:LN/y;

    .line 19
    .line 20
    iput-object p3, v0, LN/b;->t:Ljava/lang/Object;

    .line 21
    .line 22
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LN/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LN/b;->q:I

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
    goto :goto_1

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
    iget-object p1, p0, LN/b;->r:LN/o;

    .line 24
    .line 25
    iget-object v0, p0, LN/b;->s:LN/y;

    .line 26
    .line 27
    iget-object v2, p0, LN/b;->t:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, LN/y;->d(Ljava/lang/Object;)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, LN/b;->u:LN/r;

    .line 45
    .line 46
    iget-object v3, v2, LN/r;->j:LP/b0;

    .line 47
    .line 48
    invoke-virtual {v3}, LP/b0;->e()F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object v3, v2, LN/r;->j:LP/b0;

    .line 61
    .line 62
    invoke-virtual {v3}, LP/b0;->e()F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :goto_0
    iput v3, v0, Lkotlin/jvm/internal/v;->q:F

    .line 67
    .line 68
    iget-object v6, v2, LN/r;->c:Lu/k;

    .line 69
    .line 70
    new-instance v7, LB0/j0;

    .line 71
    .line 72
    const/16 v2, 0x9

    .line 73
    .line 74
    invoke-direct {v7, v2, p1, v0}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, LN/b;->r:LN/o;

    .line 79
    .line 80
    iput-object p1, p0, LN/b;->s:LN/y;

    .line 81
    .line 82
    iput v1, p0, LN/b;->q:I

    .line 83
    .line 84
    iget v5, p0, LN/b;->v:F

    .line 85
    .line 86
    move-object v8, p0

    .line 87
    invoke-static/range {v3 .. v8}, Lu/d;->b(FFFLu/k;LB5/e;Ls5/i;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 92
    .line 93
    if-ne p1, v0, :cond_3

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_3
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 97
    .line 98
    return-object p1
.end method
