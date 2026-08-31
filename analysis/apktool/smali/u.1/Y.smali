.class public final Lu/Y;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lu/d0;

.field public final synthetic v:Lu/v0;

.field public final synthetic w:F


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lu/d0;Lu/v0;FLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/Y;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lu/Y;->t:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lu/Y;->u:Lu/d0;

    .line 6
    .line 7
    iput-object p4, p0, Lu/Y;->v:Lu/v0;

    .line 8
    .line 9
    iput p5, p0, Lu/Y;->w:F

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, Lu/Y;

    .line 2
    .line 3
    iget-object v4, p0, Lu/Y;->v:Lu/v0;

    .line 4
    .line 5
    iget v5, p0, Lu/Y;->w:F

    .line 6
    .line 7
    iget-object v1, p0, Lu/Y;->s:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, Lu/Y;->t:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, p0, Lu/Y;->u:Lu/d0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lu/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu/d0;Lu/v0;FLq5/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lu/Y;->r:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, Lu/Y;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/Y;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/Y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lu/Y;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lu/Y;->u:Lu/d0;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_2

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
    iget-object p1, p0, Lu/Y;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LM5/w;

    .line 30
    .line 31
    iget-object v0, p0, Lu/Y;->s:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v4, p0, Lu/Y;->t:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v6, 0x0

    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    invoke-static {v3}, Lu/d0;->p(Lu/d0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iput-object v6, v3, Lu/d0;->E:Lu/S;

    .line 47
    .line 48
    iget-object v5, v3, Lu/d0;->t:LP/f0;

    .line 49
    .line 50
    invoke-virtual {v5}, LP/f0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v5, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_0
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    iget v5, p0, Lu/Y;->w:F

    .line 66
    .line 67
    if-nez v4, :cond_4

    .line 68
    .line 69
    iget-object v4, p0, Lu/Y;->v:Lu/v0;

    .line 70
    .line 71
    invoke-virtual {v4, v0}, Lu/v0;->p(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const-wide/16 v7, 0x0

    .line 75
    .line 76
    invoke-virtual {v4, v7, v8}, Lu/v0;->n(J)V

    .line 77
    .line 78
    .line 79
    iget-object v7, v3, Lu/d0;->s:LP/f0;

    .line 80
    .line 81
    invoke-virtual {v7, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v5}, Lu/v0;->j(F)V

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v3, v5}, Lu/d0;->y(F)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v3, Lu/d0;->D:Lr/C;

    .line 91
    .line 92
    invoke-virtual {v0}, Lr/C;->h()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    new-instance v0, Lu/X;

    .line 99
    .line 100
    invoke-direct {v0, v3, v6}, Lu/X;-><init>(Lu/d0;Lq5/c;)V

    .line 101
    .line 102
    .line 103
    const/4 v4, 0x3

    .line 104
    invoke-static {p1, v6, v6, v0, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    const-wide/high16 v4, -0x8000000000000000L

    .line 109
    .line 110
    iput-wide v4, v3, Lu/d0;->C:J

    .line 111
    .line 112
    :goto_1
    iput v2, p0, Lu/Y;->q:I

    .line 113
    .line 114
    invoke-static {v3, p0}, Lu/d0;->t(Lu/d0;Ls5/c;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 119
    .line 120
    if-ne p1, v0, :cond_6

    .line 121
    .line 122
    return-object v0

    .line 123
    :cond_6
    :goto_2
    invoke-virtual {v3}, Lu/d0;->x()V

    .line 124
    .line 125
    .line 126
    return-object v1
.end method
