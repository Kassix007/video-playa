.class public final Lz0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz0/U;

.field public b:Lz0/y;

.field public final c:Lz0/Q;

.field public final d:Lz0/Q;

.field public final e:Lz0/Q;


# direct methods
.method public constructor <init>(Lz0/U;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/S;->a:Lz0/U;

    .line 5
    .line 6
    new-instance p1, Lz0/Q;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, p0, v0}, Lz0/Q;-><init>(Lz0/S;I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lz0/S;->c:Lz0/Q;

    .line 13
    .line 14
    new-instance p1, Lz0/Q;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p1, p0, v0}, Lz0/Q;-><init>(Lz0/S;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lz0/S;->d:Lz0/Q;

    .line 21
    .line 22
    new-instance p1, Lz0/Q;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p1, p0, v0}, Lz0/Q;-><init>(Lz0/S;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lz0/S;->e:Lz0/Q;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lz0/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/S;->b:Lz0/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method
