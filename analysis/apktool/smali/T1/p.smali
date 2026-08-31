.class public abstract LT1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final q:Ljava/lang/String;

.field public final r:LW1/l;

.field public s:LT1/r;

.field public final t:Lr/S;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LT1/z;)V
    .locals 1

    .line 1
    const-string v0, "navigator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LT1/A;->b:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, LC3/a;->z(Ljava/lang/Class;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LT1/p;->q:Ljava/lang/String;

    .line 20
    .line 21
    new-instance p1, LW1/l;

    .line 22
    .line 23
    invoke-direct {p1, p0}, LW1/l;-><init>(LT1/p;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LT1/p;->r:LW1/l;

    .line 27
    .line 28
    new-instance p1, Lr/S;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v0}, Lr/S;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LT1/p;->t:Lr/S;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final d(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    .line 1
    iget-object v0, p0, LT1/p;->r:LW1/l;

    .line 2
    .line 3
    iget-object v0, v0, LW1/l;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    new-array v2, v1, [Lm5/j;

    .line 19
    .line 20
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, [Lm5/j;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Ljava/util/Map$Entry;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Ljava/lang/String;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p1, Ljava/lang/ClassCastException;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_2
    :goto_0
    return-object v1

    .line 90
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/util/Map$Entry;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p1, Ljava/lang/ClassCastException;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_7

    .line 8
    .line 9
    instance-of v2, p1, LT1/p;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_1
    iget-object v2, p0, LT1/p;->r:LW1/l;

    .line 16
    .line 17
    iget-object v3, v2, LW1/l;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast p1, LT1/p;

    .line 22
    .line 23
    iget-object v4, p1, LT1/p;->t:Lr/S;

    .line 24
    .line 25
    iget-object v5, p1, LT1/p;->r:LW1/l;

    .line 26
    .line 27
    iget-object v6, v5, LW1/l;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    iget-object v6, p0, LT1/p;->t:Lr/S;

    .line 36
    .line 37
    invoke-virtual {v6}, Lr/S;->f()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-virtual {v4}, Lr/S;->f()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-ne v7, v8, :cond_4

    .line 46
    .line 47
    new-instance v7, Lr/T;

    .line 48
    .line 49
    invoke-direct {v7, v6}, Lr/T;-><init>(Lr/S;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v7}, LI5/k;->Q(Ljava/util/Iterator;)LI5/i;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, LI5/a;

    .line 57
    .line 58
    invoke-virtual {v7}, LI5/a;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-virtual {v6, v8}, Lr/S;->c(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v4, v8}, Lr/S;->c(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-static {v9, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-nez v8, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    move v4, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    :goto_0
    move v4, v1

    .line 96
    :goto_1
    invoke-virtual {p0}, LT1/p;->g()Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    invoke-virtual {p1}, LT1/p;->g()Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-interface {v7}, Ljava/util/Map;->size()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-ne v6, v7, :cond_6

    .line 113
    .line 114
    invoke-virtual {p0}, LT1/p;->g()Ljava/util/Map;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, Ljava/lang/Iterable;

    .line 123
    .line 124
    const-string v7, "<this>"

    .line 125
    .line 126
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_5

    .line 138
    .line 139
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Ljava/util/Map$Entry;

    .line 144
    .line 145
    invoke-virtual {p1}, LT1/p;->g()Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-interface {v8, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1}, LT1/p;->g()Ljava/util/Map;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-static {v8, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_6

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move p1, v0

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    move p1, v1

    .line 185
    :goto_3
    iget v6, v2, LW1/l;->a:I

    .line 186
    .line 187
    iget v7, v5, LW1/l;->a:I

    .line 188
    .line 189
    if-ne v6, v7, :cond_7

    .line 190
    .line 191
    iget-object v2, v2, LW1/l;->e:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v2, Ljava/lang/String;

    .line 194
    .line 195
    iget-object v5, v5, LW1/l;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v5, Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    if-eqz v2, :cond_7

    .line 204
    .line 205
    if-eqz v3, :cond_7

    .line 206
    .line 207
    if-eqz v4, :cond_7

    .line 208
    .line 209
    if-eqz p1, :cond_7

    .line 210
    .line 211
    :goto_4
    return v0

    .line 212
    :cond_7
    :goto_5
    return v1
.end method

.method public final g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/p;->r:LW1/l;

    .line 2
    .line 3
    iget-object v0, v0, LW1/l;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-static {v0}, Ln5/x;->O(Ljava/util/Map;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public h(LB0/G0;)LT1/o;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LT1/p;->r:LW1/l;

    .line 6
    .line 7
    iget-object v3, v2, LW1/l;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iget-object v4, v1, LB0/G0;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v5, v2, LW1/l;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x0

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    return-object v7

    .line 27
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/4 v8, 0x0

    .line 32
    move-object v9, v7

    .line 33
    move v10, v8

    .line 34
    :cond_1
    :goto_0
    if-ge v10, v6, :cond_c

    .line 35
    .line 36
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    add-int/lit8 v10, v10, 0x1

    .line 41
    .line 42
    check-cast v11, LT1/n;

    .line 43
    .line 44
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v12, v11, LT1/n;->d:Lm5/o;

    .line 48
    .line 49
    invoke-virtual {v12}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    check-cast v13, LJ5/k;

    .line 54
    .line 55
    const/4 v14, 0x1

    .line 56
    if-nez v13, :cond_2

    .line 57
    .line 58
    move v13, v14

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    if-nez v4, :cond_3

    .line 61
    .line 62
    move v13, v8

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {v12}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    check-cast v13, LJ5/k;

    .line 69
    .line 70
    invoke-static {v13}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    invoke-virtual {v13, v15}, LJ5/k;->c(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    :goto_1
    if-eqz v13, :cond_1

    .line 82
    .line 83
    if-eqz v4, :cond_4

    .line 84
    .line 85
    invoke-virtual {v11, v4, v3}, LT1/n;->d(Landroid/net/Uri;Ljava/util/LinkedHashMap;)Landroid/os/Bundle;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    move-object/from16 v17, v13

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    move-object/from16 v17, v7

    .line 93
    .line 94
    :goto_2
    invoke-virtual {v11, v4}, LT1/n;->b(Landroid/net/Uri;)I

    .line 95
    .line 96
    .line 97
    move-result v19

    .line 98
    iget-object v13, v1, LB0/G0;->s:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v13, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v13, :cond_5

    .line 103
    .line 104
    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_5

    .line 109
    .line 110
    move/from16 v20, v14

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    move/from16 v20, v8

    .line 114
    .line 115
    :goto_3
    if-nez v17, :cond_a

    .line 116
    .line 117
    if-nez v20, :cond_6

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_6
    const-string v13, "arguments"

    .line 121
    .line 122
    invoke-static {v3, v13}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-array v13, v8, [Lm5/j;

    .line 126
    .line 127
    invoke-static {v13, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    check-cast v13, [Lm5/j;

    .line 132
    .line 133
    invoke-static {v13}, Lcom/google/android/gms/internal/measurement/P1;->g([Lm5/j;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    if-nez v4, :cond_7

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    invoke-virtual {v12}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    check-cast v12, LJ5/k;

    .line 145
    .line 146
    if-eqz v12, :cond_9

    .line 147
    .line 148
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v12, v14}, LJ5/k;->b(Ljava/lang/String;)LB0/G0;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    if-nez v12, :cond_8

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_8
    invoke-virtual {v11, v12, v13, v3}, LT1/n;->e(LB0/G0;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 160
    .line 161
    .line 162
    iget-object v12, v11, LT1/n;->e:Lm5/o;

    .line 163
    .line 164
    invoke-virtual {v12}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    check-cast v12, Ljava/lang/Boolean;

    .line 169
    .line 170
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-eqz v12, :cond_9

    .line 175
    .line 176
    invoke-virtual {v11, v4, v13, v3}, LT1/n;->f(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_4
    new-instance v12, LT1/l;

    .line 180
    .line 181
    const/4 v14, 0x1

    .line 182
    invoke-direct {v12, v14, v13}, LT1/l;-><init>(ILandroid/os/Bundle;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v3, v12}, Lcom/google/android/gms/internal/measurement/n2;->B(Ljava/util/Map;LB5/c;)Ljava/util/ArrayList;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_1

    .line 194
    .line 195
    :cond_a
    new-instance v15, LT1/o;

    .line 196
    .line 197
    iget-object v12, v2, LW1/l;->b:Ljava/lang/Object;

    .line 198
    .line 199
    move-object/from16 v16, v12

    .line 200
    .line 201
    check-cast v16, LT1/p;

    .line 202
    .line 203
    iget-boolean v11, v11, LT1/n;->l:Z

    .line 204
    .line 205
    move/from16 v18, v11

    .line 206
    .line 207
    invoke-direct/range {v15 .. v20}, LT1/o;-><init>(LT1/p;Landroid/os/Bundle;ZIZ)V

    .line 208
    .line 209
    .line 210
    if-eqz v9, :cond_b

    .line 211
    .line 212
    invoke-virtual {v15, v9}, LT1/o;->a(LT1/o;)I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-lez v11, :cond_1

    .line 217
    .line 218
    :cond_b
    move-object v9, v15

    .line 219
    goto/16 :goto_0

    .line 220
    .line 221
    :cond_c
    return-object v9
.end method

.method public hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, LT1/p;->r:LW1/l;

    .line 2
    .line 3
    iget v1, v0, LW1/l;->a:I

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    mul-int/2addr v1, v2

    .line 8
    iget-object v3, v0, LW1/l;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v3, Ljava/lang/String;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v4

    .line 21
    :goto_0
    add-int/2addr v1, v3

    .line 22
    iget-object v0, v0, LW1/l;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    move v5, v4

    .line 31
    :goto_1
    if-ge v5, v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    add-int/lit8 v5, v5, 0x1

    .line 38
    .line 39
    check-cast v6, LT1/n;

    .line 40
    .line 41
    mul-int/lit8 v1, v1, 0x1f

    .line 42
    .line 43
    iget-object v6, v6, LT1/n;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    add-int/2addr v6, v1

    .line 50
    mul-int/lit16 v1, v6, 0x3c1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string v0, "<this>"

    .line 54
    .line 55
    iget-object v3, p0, LT1/p;->t:Lr/S;

    .line 56
    .line 57
    invoke-static {v3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Lr/S;->f()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_2

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move v0, v4

    .line 69
    :goto_2
    if-nez v0, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0}, LT1/p;->g()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/Iterable;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Ljava/lang/String;

    .line 96
    .line 97
    mul-int/lit8 v1, v1, 0x1f

    .line 98
    .line 99
    invoke-static {v3, v1, v2}, LC0/S;->h(Ljava/lang/String;II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {p0}, LT1/p;->g()Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eqz v3, :cond_3

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    goto :goto_4

    .line 118
    :cond_3
    move v3, v4

    .line 119
    :goto_4
    add-int/2addr v1, v3

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    return v1

    .line 122
    :cond_5
    invoke-virtual {v3, v4}, Lr/S;->g(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v0, Ljava/lang/ClassCastException;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 132
    .line 133
    .line 134
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "(0x"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LT1/p;->r:LW1/l;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget v2, v1, LW1/l;->a:I

    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ")"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, LW1/l;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-static {v2}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v2, " route="

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "toString(...)"

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
