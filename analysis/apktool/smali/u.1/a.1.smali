.class public final Lu/a;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:Lu/l;

.field public r:Lkotlin/jvm/internal/u;

.field public s:I

.field public final synthetic t:Lu/c;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu/n0;

.field public final synthetic w:J


# direct methods
.method public constructor <init>(Lu/c;Ljava/lang/Object;Lu/n0;JLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/a;->t:Lu/c;

    .line 2
    .line 3
    iput-object p2, p0, Lu/a;->u:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lu/a;->v:Lu/n0;

    .line 6
    .line 7
    iput-wide p4, p0, Lu/a;->w:J

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, Lu/a;

    .line 2
    .line 3
    iget-object v3, p0, Lu/a;->v:Lu/n0;

    .line 4
    .line 5
    iget-wide v4, p0, Lu/a;->w:J

    .line 6
    .line 7
    iget-object v1, p0, Lu/a;->t:Lu/c;

    .line 8
    .line 9
    iget-object v2, p0, Lu/a;->u:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Lu/a;-><init>(Lu/c;Ljava/lang/Object;Lu/n0;JLq5/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu/a;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lu/a;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lu/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v1, v5, Lu/a;->v:Lu/n0;

    .line 4
    .line 5
    iget v0, v5, Lu/a;->s:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    iget-object v6, v5, Lu/a;->t:Lu/c;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v5, Lu/a;->r:Lkotlin/jvm/internal/u;

    .line 15
    .line 16
    iget-object v1, v5, Lu/a;->q:Lu/l;

    .line 17
    .line 18
    :try_start_0
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object v0, v6, Lu/c;->c:Lu/l;

    .line 37
    .line 38
    iget-object v3, v6, Lu/c;->a:LZ/m;

    .line 39
    .line 40
    iget-object v3, v3, LZ/m;->s:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, LB5/c;

    .line 43
    .line 44
    iget-object v4, v5, Lu/a;->u:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v3, v4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lu/q;

    .line 51
    .line 52
    iput-object v3, v0, Lu/l;->s:Lu/q;

    .line 53
    .line 54
    iget-object v0, v1, Lu/n0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v3, v6, Lu/c;->e:LP/f0;

    .line 57
    .line 58
    invoke-virtual {v3, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v6, Lu/c;->d:LP/f0;

    .line 62
    .line 63
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0, v3}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v6, Lu/c;->c:Lu/l;

    .line 69
    .line 70
    iget-object v3, v0, Lu/l;->r:LP/f0;

    .line 71
    .line 72
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    iget-object v3, v0, Lu/l;->s:Lu/q;

    .line 77
    .line 78
    invoke-static {v3}, Lu/d;->j(Lu/q;)Lu/q;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    iget-wide v11, v0, Lu/l;->t:J

    .line 83
    .line 84
    iget-boolean v15, v0, Lu/l;->v:Z

    .line 85
    .line 86
    new-instance v7, Lu/l;

    .line 87
    .line 88
    iget-object v8, v0, Lu/l;->q:LZ/m;

    .line 89
    .line 90
    const-wide/high16 v13, -0x8000000000000000L

    .line 91
    .line 92
    invoke-direct/range {v7 .. v15}, Lu/l;-><init>(LZ/m;Ljava/lang/Object;Lu/q;JJZ)V

    .line 93
    .line 94
    .line 95
    move-object v0, v7

    .line 96
    new-instance v7, Lkotlin/jvm/internal/u;

    .line 97
    .line 98
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    iget-wide v3, v5, Lu/a;->w:J

    .line 102
    .line 103
    move-wide v8, v3

    .line 104
    new-instance v4, LA/J;

    .line 105
    .line 106
    const/16 v3, 0xd

    .line 107
    .line 108
    invoke-direct {v4, v6, v0, v7, v3}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    iput-object v0, v5, Lu/a;->q:Lu/l;

    .line 112
    .line 113
    iput-object v7, v5, Lu/a;->r:Lkotlin/jvm/internal/u;

    .line 114
    .line 115
    iput v2, v5, Lu/a;->s:I

    .line 116
    .line 117
    move-wide v2, v8

    .line 118
    invoke-static/range {v0 .. v5}, Lu/d;->c(Lu/l;Lu/h;JLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 122
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 123
    .line 124
    if-ne v1, v2, :cond_2

    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_2
    move-object v1, v0

    .line 128
    move-object v0, v7

    .line 129
    :goto_0
    :try_start_2
    iget-boolean v0, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 130
    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    sget-object v0, Lu/i;->q:Lu/i;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    sget-object v0, Lu/i;->r:Lu/i;

    .line 137
    .line 138
    :goto_1
    invoke-static {v6}, Lu/c;->b(Lu/c;)V

    .line 139
    .line 140
    .line 141
    new-instance v2, LZ/m;

    .line 142
    .line 143
    const/16 v3, 0x19

    .line 144
    .line 145
    invoke-direct {v2, v3, v1, v0}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 146
    .line 147
    .line 148
    return-object v2

    .line 149
    :goto_2
    invoke-static {v6}, Lu/c;->b(Lu/c;)V

    .line 150
    .line 151
    .line 152
    throw v0
.end method
