.class final Landroidx/compose/ui/layout/OnGloballyPositionedElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:LZ0/c;


# direct methods
.method public constructor <init>(LZ0/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    .line 10
    .line 11
    iget-object p1, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 14
    .line 15
    if-ne v0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, Lz0/G;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 7
    .line 8
    iput-object v1, v0, Lz0/G;->E:LZ0/c;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 1

    .line 1
    check-cast p1, Lz0/G;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 4
    .line 5
    iput-object v0, p1, Lz0/G;->E:LZ0/c;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->q:LZ0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
