.class public final LA/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# instance fields
.field public final a:Lc0/e;

.field public final b:Z


# direct methods
.method public constructor <init>(Lc0/e;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA/q;->a:Lc0/e;

    .line 5
    .line 6
    iput-boolean p2, p0, LA/q;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 13

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v8, Ln5/t;->q:Ln5/t;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static/range {p3 .. p4}, LW0/a;->j(J)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static/range {p3 .. p4}, LW0/a;->i(J)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget-object v2, LA/l;->s:LA/l;

    .line 18
    .line 19
    invoke-interface {p1, v0, v1, v8, v2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    iget-boolean v0, p0, LA/q;->b:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-wide/from16 v0, p3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-wide v0, -0x1fffffffdL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long v0, p3, v0

    .line 37
    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lz0/B;

    .line 51
    .line 52
    invoke-interface {v2}, Lz0/B;->g()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-interface {v2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static/range {p3 .. p4}, LW0/a;->j(J)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v4, v1, Lz0/J;->q:I

    .line 64
    .line 65
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static/range {p3 .. p4}, LW0/a;->i(J)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget v5, v1, Lz0/J;->r:I

    .line 74
    .line 75
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    new-instance v0, LA/o;

    .line 80
    .line 81
    move-object v6, p0

    .line 82
    move-object v3, p1

    .line 83
    invoke-direct/range {v0 .. v6}, LA/o;-><init>(Lz0/J;Lz0/B;LB0/T;IILA/q;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v4, v5, v8, v0}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    new-array v4, v4, [Lz0/J;

    .line 96
    .line 97
    move-object v5, v4

    .line 98
    new-instance v4, Lkotlin/jvm/internal/w;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static/range {p3 .. p4}, LW0/a;->j(J)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    iput v6, v4, Lkotlin/jvm/internal/w;->q:I

    .line 108
    .line 109
    move-object v6, v5

    .line 110
    new-instance v5, Lkotlin/jvm/internal/w;

    .line 111
    .line 112
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static/range {p3 .. p4}, LW0/a;->i(J)I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    iput v9, v5, Lkotlin/jvm/internal/w;->q:I

    .line 120
    .line 121
    move-object v9, p2

    .line 122
    check-cast v9, Ljava/util/Collection;

    .line 123
    .line 124
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    :goto_1
    if-ge v7, v9, :cond_3

    .line 129
    .line 130
    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    check-cast v10, Lz0/B;

    .line 135
    .line 136
    invoke-interface {v10}, Lz0/B;->g()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-interface {v10, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    aput-object v10, v6, v7

    .line 144
    .line 145
    iget v11, v4, Lkotlin/jvm/internal/w;->q:I

    .line 146
    .line 147
    iget v12, v10, Lz0/J;->q:I

    .line 148
    .line 149
    invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    iput v11, v4, Lkotlin/jvm/internal/w;->q:I

    .line 154
    .line 155
    iget v11, v5, Lkotlin/jvm/internal/w;->q:I

    .line 156
    .line 157
    iget v10, v10, Lz0/J;->r:I

    .line 158
    .line 159
    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    iput v10, v5, Lkotlin/jvm/internal/w;->q:I

    .line 164
    .line 165
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    iget v9, v4, Lkotlin/jvm/internal/w;->q:I

    .line 169
    .line 170
    iget v10, v5, Lkotlin/jvm/internal/w;->q:I

    .line 171
    .line 172
    new-instance v0, LA/p;

    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    move-object v3, p1

    .line 176
    move-object v2, p2

    .line 177
    move-object v1, v6

    .line 178
    move-object v6, p0

    .line 179
    invoke-direct/range {v0 .. v7}, LA/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p1, v9, v10, v8, v0}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, LA/q;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, LA/q;

    .line 10
    .line 11
    iget-object v0, p0, LA/q;->a:Lc0/e;

    .line 12
    .line 13
    iget-object v1, p1, LA/q;->a:Lc0/e;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-boolean v0, p0, LA/q;->b:Z

    .line 23
    .line 24
    iget-boolean p1, p1, LA/q;->b:Z

    .line 25
    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 31
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LA/q;->a:Lc0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean v1, p0, LA/q;->b:Z

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BoxMeasurePolicy(alignment="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA/q;->a:Lc0/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", propagateMinConstraints="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, LA/q;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x29

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
