.class public final LM/Y;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LM/I0;

.field public final synthetic s:F


# direct methods
.method public constructor <init>(LM/I0;FLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/Y;->r:LM/I0;

    .line 2
    .line 3
    iput p2, p0, LM/Y;->s:F

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
    new-instance p1, LM/Y;

    .line 2
    .line 3
    iget-object v0, p0, LM/Y;->r:LM/I0;

    .line 4
    .line 5
    iget v1, p0, LM/Y;->s:F

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LM/Y;-><init>(LM/I0;FLq5/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LM/Y;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM/Y;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM/Y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LM/Y;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

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
    return-object v1

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
    iput v2, p0, LM/Y;->q:I

    .line 26
    .line 27
    iget-object p1, p0, LM/Y;->r:LM/I0;

    .line 28
    .line 29
    iget-object p1, p1, LM/I0;->c:LN/r;

    .line 30
    .line 31
    iget-object v0, p1, LN/r;->g:LP/f0;

    .line 32
    .line 33
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1}, LN/r;->f()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iget v3, p0, LM/Y;->s:F

    .line 42
    .line 43
    invoke-virtual {p1, v2, v0, v3}, LN/r;->c(FLjava/lang/Object;F)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v4, p1, LN/r;->d:LB5/c;

    .line 48
    .line 49
    invoke-interface {v4, v2}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    invoke-static {p1, v2, v3, p0}, Landroidx/compose/material3/internal/a;->b(LN/r;Ljava/lang/Object;FLs5/i;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v5, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object p1, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {p1, v0, v3, p0}, Landroidx/compose/material3/internal/a;->b(LN/r;Ljava/lang/Object;FLs5/i;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v5, :cond_2

    .line 77
    .line 78
    :goto_0
    if-ne p1, v5, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move-object p1, v1

    .line 82
    :goto_1
    if-ne p1, v5, :cond_5

    .line 83
    .line 84
    return-object v5

    .line 85
    :cond_5
    return-object v1
.end method
