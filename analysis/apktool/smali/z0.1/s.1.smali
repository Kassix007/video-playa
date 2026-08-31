.class public final Lz0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/D;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lz0/t;

.field public final synthetic e:Lz0/y;

.field public final synthetic f:LB5/c;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lz0/t;Lz0/y;LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lz0/s;->a:I

    .line 5
    .line 6
    iput p2, p0, Lz0/s;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lz0/s;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lz0/s;->d:Lz0/t;

    .line 11
    .line 12
    iput-object p5, p0, Lz0/s;->e:Lz0/y;

    .line 13
    .line 14
    iput-object p6, p0, Lz0/s;->f:LB5/c;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lz0/s;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lz0/s;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/s;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lz0/s;->e:Lz0/y;

    .line 2
    .line 3
    iget-object v0, v0, Lz0/y;->q:LB0/L;

    .line 4
    .line 5
    iget-object v1, p0, Lz0/s;->d:Lz0/t;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz0/t;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lz0/s;->f:LB5/c;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, LB0/L;->U:LB0/g0;

    .line 16
    .line 17
    iget-object v1, v1, LB0/g0;->b:LB0/v;

    .line 18
    .line 19
    iget-object v1, v1, LB0/v;->b0:LB0/u;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, LB0/T;->y:Lz0/z;

    .line 24
    .line 25
    invoke-interface {v2, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 30
    .line 31
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 32
    .line 33
    iget-object v0, v0, LB0/T;->y:Lz0/z;

    .line 34
    .line 35
    invoke-interface {v2, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final e()LB5/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
