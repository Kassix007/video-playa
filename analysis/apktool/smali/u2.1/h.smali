.class public final Lu2/h;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lu2/n;


# direct methods
.method public constructor <init>(Lu2/n;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu2/h;->s:Lu2/n;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, Lu2/h;

    .line 2
    .line 3
    iget-object v1, p0, Lu2/h;->s:Lu2/n;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu2/h;-><init>(Lu2/n;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu2/h;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LD2/j;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu2/h;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu2/h;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu2/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lu2/h;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lu2/h;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lu2/n;

    .line 12
    .line 13
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lu2/h;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LD2/j;

    .line 32
    .line 33
    iget-object v0, p0, Lu2/h;->s:Lu2/n;

    .line 34
    .line 35
    iget-object v3, v0, Lu2/n;->I:LP/f0;

    .line 36
    .line 37
    invoke-virtual {v3}, LP/f0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lt2/l;

    .line 42
    .line 43
    invoke-static {p1}, LD2/j;->a(LD2/j;)LD2/h;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, Li1/a;

    .line 48
    .line 49
    const/16 v6, 0xa

    .line 50
    .line 51
    invoke-direct {v5, v6, v0}, Li1/a;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object v5, v4, LD2/h;->d:LF2/b;

    .line 55
    .line 56
    invoke-virtual {v4}, LD2/h;->b()V

    .line 57
    .line 58
    .line 59
    iget-object p1, p1, LD2/j;->z:LD2/d;

    .line 60
    .line 61
    iget-object v5, p1, LD2/d;->a:LE2/i;

    .line 62
    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    new-instance v5, Li3/a;

    .line 66
    .line 67
    const/16 v6, 0xb

    .line 68
    .line 69
    invoke-direct {v5, v6, v0}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v4, LD2/h;->m:LE2/i;

    .line 73
    .line 74
    invoke-virtual {v4}, LD2/h;->b()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object v5, p1, LD2/d;->b:LE2/g;

    .line 78
    .line 79
    if-nez v5, :cond_5

    .line 80
    .line 81
    iget-object v5, v0, Lu2/n;->D:Lz0/j;

    .line 82
    .line 83
    sget-object v6, Lu2/w;->b:LE2/e;

    .line 84
    .line 85
    sget-object v6, Lz0/i;->a:Lz0/F;

    .line 86
    .line 87
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-nez v6, :cond_4

    .line 92
    .line 93
    sget-object v6, Lz0/i;->b:Lz0/F;

    .line 94
    .line 95
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    sget-object v5, LE2/g;->q:LE2/g;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    :goto_0
    sget-object v5, LE2/g;->r:LE2/g;

    .line 106
    .line 107
    :goto_1
    iput-object v5, v4, LD2/h;->n:LE2/g;

    .line 108
    .line 109
    :cond_5
    iget-object p1, p1, LD2/d;->c:LE2/d;

    .line 110
    .line 111
    sget-object v5, LE2/d;->q:LE2/d;

    .line 112
    .line 113
    if-eq p1, v5, :cond_6

    .line 114
    .line 115
    sget-object p1, LE2/d;->r:LE2/d;

    .line 116
    .line 117
    iput-object p1, v4, LD2/h;->f:LE2/d;

    .line 118
    .line 119
    :cond_6
    invoke-virtual {v4}, LD2/h;->a()LD2/j;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object v0, p0, Lu2/h;->r:Ljava/lang/Object;

    .line 124
    .line 125
    iput v2, p0, Lu2/h;->q:I

    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v2, p1, LD2/j;->c:LF2/b;

    .line 131
    .line 132
    instance-of v2, v2, LF2/a;

    .line 133
    .line 134
    if-eqz v2, :cond_7

    .line 135
    .line 136
    new-instance v2, Lt2/h;

    .line 137
    .line 138
    invoke-direct {v2, p1, v1, v3}, Lt2/h;-><init>(LD2/j;Lq5/c;Lt2/l;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v2, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    goto :goto_2

    .line 146
    :cond_7
    sget-object v2, LM5/H;->a:LT5/e;

    .line 147
    .line 148
    sget-object v2, LR5/n;->a:LN5/f;

    .line 149
    .line 150
    iget-object v2, v2, LN5/f;->t:LN5/f;

    .line 151
    .line 152
    new-instance v4, Lt2/i;

    .line 153
    .line 154
    invoke-direct {v4, p1, v1, v3}, Lt2/i;-><init>(LD2/j;Lq5/c;Lt2/l;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v4, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_2
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 162
    .line 163
    if-ne p1, v2, :cond_8

    .line 164
    .line 165
    return-object v2

    .line 166
    :cond_8
    :goto_3
    check-cast p1, LD2/k;

    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    instance-of v2, p1, LD2/r;

    .line 172
    .line 173
    if-eqz v2, :cond_9

    .line 174
    .line 175
    new-instance v1, Lu2/f;

    .line 176
    .line 177
    check-cast p1, LD2/r;

    .line 178
    .line 179
    iget-object v2, p1, LD2/r;->a:Landroid/graphics/drawable/Drawable;

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Lu2/n;->j(Landroid/graphics/drawable/Drawable;)Lo0/b;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-direct {v1, v0, p1}, Lu2/f;-><init>(Lo0/b;LD2/r;)V

    .line 186
    .line 187
    .line 188
    return-object v1

    .line 189
    :cond_9
    instance-of v2, p1, LD2/e;

    .line 190
    .line 191
    if-eqz v2, :cond_b

    .line 192
    .line 193
    new-instance v2, Lu2/d;

    .line 194
    .line 195
    check-cast p1, LD2/e;

    .line 196
    .line 197
    iget-object v3, p1, LD2/e;->a:Landroid/graphics/drawable/Drawable;

    .line 198
    .line 199
    if-eqz v3, :cond_a

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Lu2/n;->j(Landroid/graphics/drawable/Drawable;)Lo0/b;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    :cond_a
    invoke-direct {v2, v1, p1}, Lu2/d;-><init>(Lo0/b;LD2/e;)V

    .line 206
    .line 207
    .line 208
    return-object v2

    .line 209
    :cond_b
    new-instance p1, LC2/e;

    .line 210
    .line 211
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 212
    .line 213
    .line 214
    throw p1
.end method
