.class public final LP5/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final q:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP5/U;->q:Ljava/lang/Throwable;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, LP5/U;->q:Ljava/lang/Throwable;

    .line 2
    .line 3
    throw p1
.end method
