.class final Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "LB5/a;"
    }
.end annotation


# instance fields
.field final synthetic $tryUnregister:LB5/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LB5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;->$tryUnregister:LB5/a;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;->invoke()V

    sget-object v0, Lm5/y;->a:Lm5/y;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/work/impl/constraints/NetworkRequestConstraintController$track$1$1;->$tryUnregister:LB5/a;

    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    return-void
.end method
