.class public final LA0/b;
.super Lcom/google/android/gms/internal/measurement/I1;
.source "SourceFile"


# static fields
.field public static final c:LA0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA0/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/I1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA0/b;->c:LA0/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final O(LA0/h;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final X(LA0/h;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method
