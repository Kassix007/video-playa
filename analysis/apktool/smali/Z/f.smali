.class public final LZ/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/c;


# static fields
.field public static final e:LZ/m;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lr/G;

.field public c:LZ/i;

.field public final d:LB0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, LZ/d;->r:LZ/d;

    .line 2
    .line 3
    sget-object v1, LZ/e;->r:LZ/e;

    .line 4
    .line 5
    sget-object v2, LZ/n;->a:LZ/m;

    .line 6
    .line 7
    new-instance v2, LZ/m;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v3, v0, v1}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sput-object v2, LZ/f;->e:LZ/m;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/f;->a:Ljava/util/Map;

    .line 5
    .line 6
    sget-object p1, Lr/O;->a:[J

    .line 7
    .line 8
    new-instance p1, Lr/G;

    .line 9
    .line 10
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LZ/f;->b:Lr/G;

    .line 14
    .line 15
    new-instance p1, LB0/a;

    .line 16
    .line 17
    const/16 v0, 0x16

    .line 18
    .line 19
    invoke-direct {p1, v0, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LZ/f;->d:LB0/a;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/f;->b:Lr/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LZ/f;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;LX/e;LP/o;I)V
    .locals 4

    .line 1
    const v0, -0x47703d6d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p1}, LP/o;->V(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, LP/k;->a:LP/S;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LZ/f;->d:LB0/a;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, LZ/f;->a:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/util/Map;

    .line 39
    .line 40
    sget-object v3, LZ/k;->a:LP/T0;

    .line 41
    .line 42
    new-instance v3, LZ/j;

    .line 43
    .line 44
    invoke-direct {v3, v2, v0}, LZ/j;-><init>(Ljava/util/Map;LB5/c;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v0, v3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string p3, "Type of the key "

    .line 55
    .line 56
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p1, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p2

    .line 81
    :cond_1
    :goto_0
    check-cast v0, LZ/i;

    .line 82
    .line 83
    sget-object v2, LZ/k;->a:LP/T0;

    .line 84
    .line 85
    invoke-virtual {v2, v0}, LP/T0;->a(Ljava/lang/Object;)LP/m0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    and-int/lit8 p4, p4, 0x70

    .line 90
    .line 91
    const/16 v3, 0x8

    .line 92
    .line 93
    or-int/2addr p4, v3

    .line 94
    invoke-static {v2, p2, p3, p4}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3, p0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {p3, p1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    or-int/2addr p2, p4

    .line 106
    invoke-virtual {p3, v0}, LP/o;->i(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p4

    .line 110
    or-int/2addr p2, p4

    .line 111
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    if-nez p2, :cond_2

    .line 116
    .line 117
    if-ne p4, v1, :cond_3

    .line 118
    .line 119
    :cond_2
    new-instance p4, LA/J;

    .line 120
    .line 121
    const/4 p2, 0x4

    .line 122
    invoke-direct {p4, p0, p1, v0, p2}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p3, p4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    check-cast p4, LB5/c;

    .line 129
    .line 130
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 131
    .line 132
    invoke-static {p1, p4, p3}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 133
    .line 134
    .line 135
    iget-boolean p1, p3, LP/o;->x:Z

    .line 136
    .line 137
    const/4 p2, 0x0

    .line 138
    if-eqz p1, :cond_4

    .line 139
    .line 140
    iget-object p1, p3, LP/o;->F:LP/z0;

    .line 141
    .line 142
    iget p1, p1, LP/z0;->i:I

    .line 143
    .line 144
    iget p4, p3, LP/o;->y:I

    .line 145
    .line 146
    if-ne p1, p4, :cond_4

    .line 147
    .line 148
    const/4 p1, -0x1

    .line 149
    iput p1, p3, LP/o;->y:I

    .line 150
    .line 151
    iput-boolean p2, p3, LP/o;->x:Z

    .line 152
    .line 153
    :cond_4
    invoke-virtual {p3, p2}, LP/o;->p(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, p2}, LP/o;->p(Z)V

    .line 157
    .line 158
    .line 159
    return-void
.end method
