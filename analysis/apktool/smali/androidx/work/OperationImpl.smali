.class final Landroidx/work/OperationImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/work/Operation;


# instance fields
.field private final future:LI4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI4/b;"
        }
    .end annotation
.end field

.field private final state:Landroidx/lifecycle/G;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/G;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/lifecycle/G;LI4/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/G;",
            "LI4/b;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "future"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/work/OperationImpl;->state:Landroidx/lifecycle/G;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/work/OperationImpl;->future:LI4/b;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public getResult()LI4/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LI4/b;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/OperationImpl;->future:LI4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getState()Landroidx/lifecycle/G;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/G;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/work/OperationImpl;->state:Landroidx/lifecycle/G;

    .line 2
    .line 3
    return-object v0
.end method
