.class public final Lk5/b;
.super Landroidx/lifecycle/f0;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/lifecycle/J;

.field public final c:Landroidx/lifecycle/J;

.field public final d:LP5/S;

.field public final e:LP5/D;

.field public final f:Landroidx/lifecycle/J;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/f0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/J;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/lifecycle/G;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk5/b;->b:Landroidx/lifecycle/J;

    .line 10
    .line 11
    iput-object v0, p0, Lk5/b;->c:Landroidx/lifecycle/J;

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lk5/b;->d:LP5/S;

    .line 20
    .line 21
    new-instance v1, LP5/D;

    .line 22
    .line 23
    invoke-direct {v1, v0}, LP5/D;-><init>(LP5/S;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lk5/b;->e:LP5/D;

    .line 27
    .line 28
    new-instance v0, Landroidx/lifecycle/J;

    .line 29
    .line 30
    invoke-direct {v0}, Landroidx/lifecycle/G;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lk5/b;->f:Landroidx/lifecycle/J;

    .line 34
    .line 35
    return-void
.end method
