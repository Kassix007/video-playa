.class final Landroidx/work/OperationKt$await$1;
.super Ls5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/OperationKt;->await(Landroidx/work/Operation;Lq5/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Ls5/e;
    c = "androidx.work.OperationKt"
    f = "Operation.kt"
    l = {
        0x24
    }
    m = "await"
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq5/c<",
            "-",
            "Landroidx/work/OperationKt$await$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Ls5/c;-><init>(Lq5/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/work/OperationKt$await$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/work/OperationKt$await$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/work/OperationKt$await$1;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Landroidx/work/OperationKt;->await(Landroidx/work/Operation;Lq5/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
