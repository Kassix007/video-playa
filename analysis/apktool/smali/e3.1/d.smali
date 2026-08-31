.class public final Le3/d;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public q:I

.field public final synthetic r:Le3/g;

.field public final synthetic s:I

.field public final synthetic t:F

.field public final synthetic u:La3/k;

.field public final synthetic v:F

.field public final synthetic w:Le3/m;


# direct methods
.method public constructor <init>(Le3/g;IFLa3/k;FLe3/m;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/d;->r:Le3/g;

    .line 2
    .line 3
    iput p2, p0, Le3/d;->s:I

    .line 4
    .line 5
    iput p3, p0, Le3/d;->t:F

    .line 6
    .line 7
    iput-object p4, p0, Le3/d;->u:La3/k;

    .line 8
    .line 9
    iput p5, p0, Le3/d;->v:F

    .line 10
    .line 11
    iput-object p6, p0, Le3/d;->w:Le3/m;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1, p7}, Ls5/i;-><init>(ILq5/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 8

    .line 1
    new-instance v0, Le3/d;

    .line 2
    .line 3
    iget v5, p0, Le3/d;->v:F

    .line 4
    .line 5
    iget-object v6, p0, Le3/d;->w:Le3/m;

    .line 6
    .line 7
    iget-object v1, p0, Le3/d;->r:Le3/g;

    .line 8
    .line 9
    iget v2, p0, Le3/d;->s:I

    .line 10
    .line 11
    iget v3, p0, Le3/d;->t:F

    .line 12
    .line 13
    iget-object v4, p0, Le3/d;->u:La3/k;

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    invoke-direct/range {v0 .. v7}, Le3/d;-><init>(Le3/g;IFLa3/k;FLe3/m;Lq5/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Le3/d;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Le3/d;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Le3/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Le3/d;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Le3/d;->r:Le3/g;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Le3/d;->s:I

    .line 34
    .line 35
    invoke-virtual {v4, p1}, Le3/g;->f(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v4, Le3/g;->q:LP/f0;

    .line 39
    .line 40
    iget-object v0, v4, Le3/g;->s:LP/f0;

    .line 41
    .line 42
    const v5, 0x7fffffff

    .line 43
    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v0, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v4, Le3/g;->t:LP/f0;

    .line 53
    .line 54
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v0, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v4, Le3/g;->v:LP/f0;

    .line 60
    .line 61
    iget v7, p0, Le3/d;->t:F

    .line 62
    .line 63
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v0, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    iget-object v8, v4, Le3/g;->u:LP/f0;

    .line 72
    .line 73
    invoke-virtual {v8, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, v4, Le3/g;->y:LP/f0;

    .line 77
    .line 78
    iget-object v8, p0, Le3/d;->u:La3/k;

    .line 79
    .line 80
    invoke-virtual {v0, v8}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget v0, p0, Le3/d;->v:F

    .line 84
    .line 85
    invoke-virtual {v4, v0}, Le3/g;->g(F)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v4, Le3/g;->w:LP/f0;

    .line 89
    .line 90
    invoke-virtual {v0, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v4, Le3/g;->B:LP/f0;

    .line 94
    .line 95
    const-wide/high16 v9, -0x8000000000000000L

    .line 96
    .line 97
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v0, v9}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-nez v8, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v1

    .line 110
    :cond_2
    invoke-static {v7}, Ljava/lang/Float;->isInfinite(F)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    invoke-virtual {v4}, Le3/g;->d()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {v4, v0}, Le3/g;->g(F)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v6}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v5}, Le3/g;->f(I)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :try_start_1
    iget-object p1, p0, Le3/d;->w:Le3/m;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    if-ne p1, v3, :cond_4

    .line 144
    .line 145
    sget-object p1, LM5/l0;->q:LM5/l0;

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    new-instance p1, LC2/e;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_5
    sget-object p1, Lq5/i;->q:Lq5/i;

    .line 155
    .line 156
    :goto_0
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, LM5/y;->n(Lq5/h;)LM5/b0;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    new-instance v5, Le3/c;

    .line 165
    .line 166
    iget-object v6, p0, Le3/d;->w:Le3/m;

    .line 167
    .line 168
    iget v8, p0, Le3/d;->s:I

    .line 169
    .line 170
    iget-object v9, p0, Le3/d;->r:Le3/g;

    .line 171
    .line 172
    const/4 v10, 0x0

    .line 173
    invoke-direct/range {v5 .. v10}, Le3/c;-><init>(Le3/m;LM5/b0;ILe3/g;Lq5/c;)V

    .line 174
    .line 175
    .line 176
    iput v3, p0, Le3/d;->q:I

    .line 177
    .line 178
    invoke-static {p1, v5, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 183
    .line 184
    if-ne p1, v0, :cond_6

    .line 185
    .line 186
    return-object v0

    .line 187
    :cond_6
    :goto_1
    :try_start_2
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, LM5/y;->i(Lq5/h;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 192
    .line 193
    .line 194
    invoke-static {v4, v2}, Le3/g;->c(Le3/g;Z)V

    .line 195
    .line 196
    .line 197
    return-object v1

    .line 198
    :goto_2
    invoke-static {v4, v2}, Le3/g;->c(Le3/g;Z)V

    .line 199
    .line 200
    .line 201
    throw p1
.end method
